package com.consumerapp.services;

import com.consumerapp.model.Consumer;
import com.consumerapp.model.Transaction;

public interface ConsumerServices {
	
	
	public Consumer addConusmer(Consumer consumer);
	public Consumer updateConusmer(Consumer consumer);
	public Consumer getConsumerDetails(String identifierType,String identifier);
	public Transaction getConsumerTransactions(String identifierType,String identifier);

}
