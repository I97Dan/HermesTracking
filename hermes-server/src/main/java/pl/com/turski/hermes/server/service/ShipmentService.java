package pl.com.turski.hermes.server.service;

import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;

/**
 * User: Adam
 */
public interface ShipmentService
{
	public Long registerShipment( String recipient, Address recipientAddress );

	public Shipment checkShipment( Long shipmentId );

}
