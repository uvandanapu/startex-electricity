package com.utilityservice.serviceplans;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class CustomerServiceSoapClientTest {
	
	CustomerServiceSoapClient test;
	
	@Before
	public void setUp(){
		test = mock(CustomerServiceSoapClient.class);
	}

	@Test
	public void getServiceIdTest(){
	
	when(test.getServiceId()).thenReturn(282);
	
	assertEquals(test.getServiceId(), 282);
	
	}
}