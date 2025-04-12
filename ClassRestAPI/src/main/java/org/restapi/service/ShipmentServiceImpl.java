package org.restapi.service;

import java.util.List;

import org.restapi.dao.ShipmentService;
import org.restapi.entities.Shipment;
import org.restapi.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService
{
	@Autowired
	private ShipmentRepository shipmentRepository;


	@Override
	public void createShipment(Shipment shipment) 
	{
		shipmentRepository.save(shipment);
		System.out.println("Data Saved.");
	}

	@Override
	public List<Shipment> getAllShipment() 
	{
		
		return shipmentRepository.findAll();
	}

	@Override
	public Shipment getShipmentById(long id) 
	{
		
		return shipmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Data Not Found."));
	}

	@Override
	public void updateShipment(Shipment shipment) 
	{
		shipmentRepository.save(shipment);	
	}

	@Override
	public void deleteShipment(long id) 
	{
		shipmentRepository.deleteById(id);
		
	}

	@Override
	public Shipment getShipmentByTrackingNo(String trackingNo) 
	{
		return shipmentRepository.findByTrackingNo(trackingNo);
	}

}
