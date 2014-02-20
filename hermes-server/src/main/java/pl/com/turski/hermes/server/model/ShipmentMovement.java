package pl.com.turski.hermes.server.model;

import javax.persistence.*;
import java.util.Date;

/**
 * User: Adam
 */
@Entity
public class ShipmentMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipmentMovement_gen")
    @SequenceGenerator(allocationSize = 1, name = "shipmentMovement_gen", sequenceName = "shipmentMovement_seq")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", nullable = false)
    private Shipment shipment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;
    private Boolean input;
    private Date creationDate;

    public ShipmentMovement() {
    }

    public ShipmentMovement(Shipment shipment, Location location, Boolean input, Date creationDate) {
        this.shipment = shipment;
        this.location = location;
        this.input = input;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(final Shipment shipment) {
        this.shipment = shipment;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    public Boolean getInput() {
        return input;
    }

    public void setInput(Boolean input) {
        this.input = input;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

}
