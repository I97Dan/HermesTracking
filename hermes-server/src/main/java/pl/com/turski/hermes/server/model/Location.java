package pl.com.turski.hermes.server.model;

import javax.persistence.*;

/**
 * User: Adam
 */
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_gen")
    @SequenceGenerator(initialValue = 1, name = "location_gen", sequenceName = "location_seq")
    private Long id;
    private String name;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id")
    private Address address;

    public Location() {
    }

    public Location(final String name, final Address address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }
}
