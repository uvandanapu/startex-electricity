package com.utilityservice.serviceplans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utilityservice.serviceplans.dao.CustomerDAO;
import com.utilityservice.serviceplans.model.Customer;
import com.utilityservice.serviceplans.service.jms.QueueSenderJMS;
import com.utilityservice.serviceplans.service.soapclient.PlanInfo;

@Service
public class CustomerService {

	@Autowired
	QueueSenderJMS queueSender;

	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public void addCustomer(Customer customer) {

		this.customerDAO.addCustomer(customer);
		setServicePlan(customer);
	}

	public void sendJMSMessage(Customer customer) {

		int sid = CustomerServiceSoapClient.getServiceId();

		String msg = customer.getId() + ":" + sid;

		System.out.println("Message : " + msg);

		queueSender.sendMessage(msg);
	}



	public static void setServicePlan(Customer cust) {

		List<PlanInfo> serviceList = (List<PlanInfo>) CustomerServiceSoapClient.getPlanInfo();

		PlanInfo planInfo = serviceList.get(0);

		com.utilityservice.serviceplans.model.PlanInfo plan = new com.utilityservice.serviceplans.model.PlanInfo();

		plan.setSid(CustomerServiceSoapClient.getServiceId());

		plan.setPlans(planInfo.getPlans());

		cust.setPlanInfo(plan);

	}

}
