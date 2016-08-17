package com.bootcamp.serviceprovider.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bootcamp.serviceprovider.model.PlanInfo;


@WebService
/*@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)*/
public interface CustomerServiceProvider {
	    
	@WebMethod
	public List<PlanInfo> getServiceById();
}
