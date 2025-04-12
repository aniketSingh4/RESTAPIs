package org.restapi.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Shipment")
public class Shipment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String trackingNo;
	
	private String origin;
	
	private String destination;
	
	private LocalDate estimateDeliveryTime;
	
	private String status;
	
	private String carrier;
	
	//Parameterized and Default Constructor
	public Shipment(long id, String trackingNo, String origin, String destination, LocalDate estimateDeliveryTime,
			String status, String carrier) {
		super();
		this.id = id;
		this.trackingNo = trackingNo;
		this.origin = origin;
		this.destination = destination;
		this.estimateDeliveryTime = estimateDeliveryTime;
		this.status = status;
		this.carrier = carrier;
	}
	
	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//getter and setter method

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTrackingNo() {
		return trackingNo;
	}

	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	

	public LocalDate getEstimateDeliveryTime() {
		return estimateDeliveryTime;
	}

	public void setEstimateDeliveryTime(LocalDate estimateDeliveryTime) {
		this.estimateDeliveryTime = estimateDeliveryTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	

}
