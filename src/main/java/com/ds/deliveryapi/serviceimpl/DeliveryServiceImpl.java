package com.ds.deliveryapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.deliveryapi.model.DeliveryDetails;
import com.ds.deliveryapi.repository.DeliveryRepository;
import com.ds.deliveryapi.service.DeliveryService;

@Component
public class DeliveryServiceImpl implements DeliveryService{

	@Autowired
	private DeliveryRepository deliveryRepository;
	
	@Override
	public List<DeliveryDetails> listDetials() {
		
		return deliveryRepository.findAll();
	}

	@Override
	public DeliveryDetails AddDetials(DeliveryDetails deliveryDetails) {
		
		return deliveryRepository.save(deliveryDetails);
	}

}
