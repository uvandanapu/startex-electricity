package com.utilityservice.serviceplans.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utilityservice.serviceplans.model.Customer;
import com.utilityservice.serviceplans.service.CustomerDetailsRestClient;
import com.utilityservice.serviceplans.service.CustomerService;
import com.utilityservice.serviceplans.service.jms.QueueSenderJMS;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	QueueSenderJMS queueSender;

	@Autowired
	CustomerDetailsRestClient customerDetailsRestClient;

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String displayForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "customer";
	}

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)

	public String addCustomer(ModelMap model, @ModelAttribute("customer") Customer customer) {

		if (customer != null) {

			int id = customerService.addCustomer(customer);
			
			customerService.sendJMSMessage(customer);

			try {
				
				customer = customerDetailsRestClient.getCustomerList(id);
				
			} catch (IOException e) {
				
				
				e.printStackTrace();
			}

			model.put("customer", customer);

		}

		return "customer";

	}

}
