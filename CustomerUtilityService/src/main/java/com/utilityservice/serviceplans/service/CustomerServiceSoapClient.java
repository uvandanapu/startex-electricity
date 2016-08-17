package com.utilityservice.serviceplans.service;

import java.util.List;

import com.utilityservice.serviceplans.service.soapclient.CustomerServiceProvider;
import com.utilityservice.serviceplans.service.soapclient.PlanInfo;
import com.utilityservice.serviceplans.service.soapclient.ServiceProvider;

public class CustomerServiceSoapClient {

	public static List<PlanInfo> getPlanInfo() {

		ServiceProvider provider = new ServiceProvider();

		CustomerServiceProvider custServProvider = provider.getCustomerServiceProviderImplPort();

		List<PlanInfo> planInfo = custServProvider.getServiceById();
		

		return planInfo;

	}

	public static int getServiceId() {

		
		int sid = CustomerServiceSoapClient.getPlanInfo().get(0).getSid();
		
		return sid;
	}

	
		
		
		
		
	
	
	
	
}
