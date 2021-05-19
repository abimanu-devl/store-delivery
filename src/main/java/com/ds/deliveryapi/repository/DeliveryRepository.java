package com.ds.deliveryapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ds.deliveryapi.model.DeliveryDetails;

public interface DeliveryRepository extends MongoRepository<DeliveryDetails, Integer>{

}
