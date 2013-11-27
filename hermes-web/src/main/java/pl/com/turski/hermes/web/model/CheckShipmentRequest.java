package pl.com.turski.hermes.web.model;

/**
 * User: Adam
 */
public class CheckShipmentRequest
{
	private Long shipmentId;

	public CheckShipmentRequest()
	{
	}

	public CheckShipmentRequest( final Long shipmentId )
	{
		this.shipmentId = shipmentId;
	}

	public Long getShipmentId()
	{
		return shipmentId;
	}

	public void setShipmentId( final Long shipmentId )
	{
		this.shipmentId = shipmentId;
	}
}
