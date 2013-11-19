package pl.com.turski.hermes.server.model;

import javax.persistence.*;
import java.util.Date;

/**
 * User: Adam
 */
@Entity
public class Delivery
{
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "delivery_gen" )
	@SequenceGenerator( allocationSize = 1, name = "delivery_gen", sequenceName = "delivery_id" )
	private Long id;
	private String recipient;
	@OneToOne( fetch = FetchType.LAZY, cascade = { CascadeType.ALL } )
	@JoinColumn( name = "address_id" )
	private Address recipientAddress;
	private Date created;

	public Delivery()
	{
	}

	public Delivery( final String recipient, final Address recipientAddress, final Date created )
	{
		this.recipient = recipient;
		this.recipientAddress = recipientAddress;
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

	public Address getRecipientAddress()
	{
		return recipientAddress;
	}

	public void setRecipientAddress( final Address recipientAddress )
	{
		this.recipientAddress = recipientAddress;
	}

	public Date getCreated()
	{
		return created;
	}

	public void setCreated( final Date created )
	{
		this.created = created;
	}

	@Override
	public String toString()
	{
		return "Delivery{" +
			"id=" + id +
			", recipient='" + recipient + '\'' +
			", recipientAddress=" + recipientAddress +
			", created=" + created +
			'}';
	}
}
