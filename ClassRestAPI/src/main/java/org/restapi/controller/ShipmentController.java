package org.restapi.controller;

import java.util.List;

import org.restapi.entities.Shipment;
import org.restapi.service.ShipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipment")
public class ShipmentController 
{
	@Autowired
	private ShipmentServiceImpl shipmentService;
	
	@GetMapping
	public List<Shipment> getAllShipment()
	{
		return shipmentService.getAllShipment();
	}
	
	@GetMapping("/{id}")
	public Shipment getShipmentById(@PathVariable long id)
	{
		return shipmentService.getShipmentById(id);
	}
	
	@GetMapping("/track/{trackingNo}")
	public Shipment getShipmentByTrackingIds(@PathVariable String trackingNo)
	{
		return shipmentService.getShipmentByTrackingNo(trackingNo);
	}
	
	@PostMapping
	public void createShipment(@RequestBody Shipment shipment)
	{
		shipmentService.createShipment(shipment);
	}
	
	@PutMapping
	public void updateShipment(@RequestBody Shipment shipment)
	{
		shipmentService.updateShipment(shipment);
	}
	
	@DeleteMapping("/{id}")
	public void deleteShipment(@PathVariable long id)
	{
		shipmentService.deleteShipment(id);
	}

}
