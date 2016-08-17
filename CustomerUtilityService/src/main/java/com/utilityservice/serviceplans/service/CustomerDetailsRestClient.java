package com.utilityservice.serviceplans.service;

import java.io.IOException;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.utilityservice.serviceplans.model.Customer;

public class CustomerDetailsRestClient {

	public Customer getCustomerList(int id) throws IOException {

		Customer customer = null;

		try {

			DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
			
			defaultClientConfig.getClasses().add(JacksonJsonProvider.class);
			
			Client client = Client.create(defaultClientConfig);
			
			WebResource webResource = client.resource("http://localhost:8080/ServiceProvider/rest/Customer/" + id);

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {

				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			System.out.println("Output from Server .... \n");

			customer = response.getEntity(Customer.class);

			System.out.println(customer);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return customer;
	}

}
