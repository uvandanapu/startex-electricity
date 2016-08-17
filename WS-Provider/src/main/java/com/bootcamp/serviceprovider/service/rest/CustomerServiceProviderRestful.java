package com.bootcamp.serviceprovider.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bootcamp.serviceprovider.dao.RestfulCustomerServiceDAO;
import com.bootcamp.serviceprovider.model.CustomerInfo;

//Sets the path to base URL + /Customer
@Path("/Customer")
public class CustomerServiceProviderRestful {

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	@HeaderParam(value = "content-type = application/octet-stream")
	public CustomerInfo getCustomer(@PathParam("param") int id) {

		RestfulCustomerServiceDAO restDAO = new RestfulCustomerServiceDAO();

		CustomerInfo customerInfo = restDAO.getCustomerDetails(id);

		return customerInfo;

	}

}
