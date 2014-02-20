package pl.com.turski.hermes.web.model;

/**
 * User: Adam
 */
public class CheckShipmentForm
{
	private String shipmentId;

	public CheckShipmentForm()
	{
	}

	public CheckShipmentForm(final String shipmentId)
	{
		this.shipmentId = shipmentId;
	}

	public String getShipmentId()
	{
		return shipmentId;
	}

	public void setShipmentId( final String shipmentId )
	{
		this.shipmentId = shipmentId;
	}
}
