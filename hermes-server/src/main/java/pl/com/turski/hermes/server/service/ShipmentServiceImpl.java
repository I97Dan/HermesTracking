package pl.com.turski.hermes.server.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.turski.hermes.server.repository.ShipmentRepository;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;
import pl.com.turski.hermes.server.model.ShipmentStatus;

import java.util.ArrayList;
import java.util.Date;

/**
 * User: Adam
 */
@Service
public class ShipmentServiceImpl implements ShipmentService
{
	private static final Logger log = Logger.getLogger( ShipmentServiceImpl.class );

	@Autowired
	private ShipmentRepository shipmentRepository;

	@Override
	@Transactional
	public Long registerShipment( String recipient, Address recipientAddress )
	{
		log.info( "START registerShipment for: recipient=" + recipient + "|recipientAddress=" + recipientAddress );
		Shipment shipment = new Shipment( recipient, recipientAddress, new ArrayList<ShipmentStatus>(), new Date() );
		Shipment createdShipment = shipmentRepository.save( shipment );
		log.info( "END registerShipment with: createdShipment.id="+createdShipment.getId() );
		return createdShipment.getId();
	}

	@Override
	@Transactional
	public Shipment checkShipment( Long shipmentId )
	{
		log.info( "START checkShipment for: shipmentId=" + shipmentId );
		Shipment shipment = shipmentRepository.findOne( shipmentId );
		log.info( "END checkShipment with: shipment.id="+shipment.getId() );
		return shipment;
	}

}
