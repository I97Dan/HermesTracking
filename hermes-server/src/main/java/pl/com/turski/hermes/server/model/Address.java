package pl.com.turski.hermes.server.model;

import javax.persistence.*;

/**
 * User: Adam
 */
@Entity
public class Address
{
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "address_gen" )
	@SequenceGenerator( allocationSize = 1, name = "address_gen", sequenceName = "address_id" )
	private long id;
	private String city;
	private String street;
	private String house;
	private String flat;
	private String postcode;
	private String country;

	public Address()
	{
	}

	public Address( final String city, final String street, final String house, final String flat, final String postcode, final String country )
	{
		this.city = city;
		this.street = street;
		this.house = house;
		this.flat = flat;
		this.postcode = postcode;
		this.country = country;
	}

	public long getId()
	{
		return id;
	}

	public void setId( final long id )
	{
		this.id = id;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity( final String city )
	{
		this.city = city;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet( final String street )
	{
		this.street = street;
	}

	public String getHouse()
	{
		return house;
	}

	public void setHouse( final String house )
	{
		this.house = house;
	}

	public String getFlat()
	{
		return flat;
	}

	public void setFlat( final String flat )
	{
		this.flat = flat;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode( final String postcode )
	{
		this.postcode = postcode;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry( final String country )
	{
		this.country = country;
	}

	@Override
	public String toString()
	{
		return "Address{" +
			"id=" + id +
			", city='" + city + '\'' +
			", street='" + street + '\'' +
			", house='" + house + '\'' +
			", flat='" + flat + '\'' +
			", postcode='" + postcode + '\'' +
			", country='" + country + '\'' +
			'}';
	}
}
