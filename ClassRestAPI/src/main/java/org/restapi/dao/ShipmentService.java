package org.restapi.dao;

import java.util.List;

import org.restapi.entities.Shipment;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentService 
{
	public void createShipment(Shipment shipment);
	
	public List<Shipment> getAllShipment();
	
	public Shipment getShipmentById(long id);
	
	public void updateShipment(Shipment shipment);
	
	public void deleteShipment(long id);
	
	public Shipment getShipmentByTrackingNo(String trackingNo);

}
