package pl.com.turski.hermes.server.webservice;

import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;
import pl.com.turski.hermes.server.model.ShipmentMovement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * User: Adam
 */
@WebService
public interface ShipmentWS {
    @WebMethod
    public List<Shipment> shipmentList();

    @WebMethod
    public Long registerShipment(@WebParam(name = "recipient") String recipient, @WebParam(name = "recipientAddress") Address recipientAddress);

    @WebMethod
    public Shipment checkShipment(@WebParam(name = "shipmentId") Long shipmentId);

    @WebMethod
    public List<ShipmentMovement> shipmentMovementList(@WebParam(name = "shipmentId") Long shipmentId);

}
