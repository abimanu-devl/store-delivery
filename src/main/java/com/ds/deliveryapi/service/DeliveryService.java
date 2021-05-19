package com.ds.deliveryapi.service;

import java.util.List;

import com.ds.deliveryapi.model.DeliveryDetails;

public interface DeliveryService {
	
	public List<DeliveryDetails> listDetials();
	public DeliveryDetails AddDetials(DeliveryDetails deliveryDetails);

}
