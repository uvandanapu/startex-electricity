package com.bootcamp.serviceprovider.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


import com.bootcamp.serviceprovider.dao.CustomerServiceProviderDAO;
import com.bootcamp.serviceprovider.model.PlanInfo;
import com.bootcamp.serviceprovider.service.CustomerServiceProvider;

@WebService(endpointInterface = "com.bootcamp.serviceprovider.service.CustomerServiceProvider",serviceName="ServiceProvider")
public class CustomerServiceProviderImpl implements CustomerServiceProvider {

	/*private CustomerServiceProviderDAO serviceDAO;


	public void setServiceDAO(CustomerServiceProviderDAO serviceDAO) {
		this.serviceDAO = serviceDAO;
	}
	*/

	 public List<PlanInfo> getServiceById() {
    	
    	CustomerServiceProviderDAO serviceDAO = new CustomerServiceProviderDAO();
    	
    	List<PlanInfo> planInfo = new ArrayList<PlanInfo>();
		
		 planInfo = serviceDAO.getServiceById();
		 
		 return planInfo;
		
	}
	
	
	
}
