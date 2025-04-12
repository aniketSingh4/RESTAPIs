package org.restapi.repository;

import org.restapi.entities.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long>
{
	//Custom Finder method
	public Shipment findByTrackingNo(String trackingNo);

}
