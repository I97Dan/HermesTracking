package pl.com.turski.hermes.server.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * User: Adam
 */
@Entity
public class Shipment
{
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "shipment_gen" )
	@SequenceGenerator( allocationSize = 1, name = "shipment_gen", sequenceName = "shipment_seq" )
	private Long id;
	private String recipient;
	@OneToOne( fetch = FetchType.LAZY, cascade = { CascadeType.ALL } )
	@JoinColumn( name = "address_id" )
	private Address address;
	@OneToMany(mappedBy = "shipment")
	private List<ShipmentStatus> shipmentStatusList;
	private Date created;


	public Shipment()
	{
	}

	public Shipment( final String recipient, final Address address, final List<ShipmentStatus> shipmentStatusList, final Date created )
	{
		this.recipient = recipient;
		this.address = address;
		this.shipmentStatusList = shipmentStatusList;
		this.created = created;
	}

	public Long getId()
	{
		return id;
	}

	public void setId( final Long id )
	{
		this.id = id;
	}

	public String getRecipient()
	{
		return recipient;
	}

	public void setRecipient( final String recipient )
	{
		this.recipient = recipient;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress( final Address address )
	{
		this.address = address;
	}

	public Date getCreated()
	{
		return created;
	}

	public void setCreated( final Date created )
	{
		this.created = created;
	}

	public List<ShipmentStatus> getShipmentStatusList()
	{
		return shipmentStatusList;
	}

	public void setShipmentStatusList( final List<ShipmentStatus> shipmentStatusList )
	{
		this.shipmentStatusList = shipmentStatusList;
	}

}
