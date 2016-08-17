package com.bootcamp.serviceprovider.service.jms;

import javax.transaction.Transactional;

import com.bootcamp.serviceprovider.dao.MessageServiceDao;
import com.bootcamp.serviceprovider.model.CustomerInfo;

public class MessageServiceJMS {

	@Transactional
	public void setCustomerService(int c_id, int service_id) {

		MessageServiceDao messageServiceDao = new MessageServiceDao();

		messageServiceDao.saveCustomerService(c_id, service_id);
	}

}
