package com.bootcamp.serviceprovider.service.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class JMSMessageListner implements MessageListener {

	@Override
	public void onMessage(Message message) {

		TextMessage txtMsg = (TextMessage) message;

		System.out.println(txtMsg);

		try {

			String scid = txtMsg.getText();

			String[] messageArray = scid.split(":");

			int serviceId = Integer.parseInt(messageArray[1]);
			int customerId = Integer.parseInt(messageArray[0]);

			System.out.println(serviceId + " " + customerId);

			MessageServiceJMS msgService = new MessageServiceJMS();

			msgService.setCustomerService(customerId, serviceId);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
