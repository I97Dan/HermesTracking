package pl.com.turski.hermes.web.model;

import pl.com.turski.hermes.web.webservice.Address;

/**
 * User: Adam
 */
public class CreateDeliveryRequest
{
	private String recipient;
	private Address recipientAddress;

	public CreateDeliveryRequest()
	{
	}

	public CreateDeliveryRequest( final String recipient, final Address recipientAddress )
	{
		this.recipient = recipient;
		this.recipientAddress = recipientAddress;
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
}
