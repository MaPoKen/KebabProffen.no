package no.kebabproffen.kebabproffen;	

import java.util.UUID;

import javax.persistence.*;

@Entity
@Table(name = "location")
class Location{

//    @OneToMany
    
    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private int locationId;

    private double longitude;
    
    private double latitude;
    
    private String city;
    
    private String country;

    public Location(int locationId, double longitude, double latitude, String city, String country ){
        this.locationId = locationId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.city = city;
        this.country = country;
    }

    public int getLocationId(){
    	return locationId;
    }
    
    public double getLongitude(){
    	return longitude;
    }
    
    public void setLongitude(double newLongitude){
    	longitude = newLongitude;
    }
    
    public double getLatitude(){
    	return latitude;
    }

    public void setLatitude(double newLatitude){
    	latitude = newLatitude;
    }
    
    public String getCity(){
    	return city;
    }

    public void setCity(String newCity){
    	city = newCity;
    }

    public String getCountry(){
    	return country;
    }
    
   public void setCountry(String newCountry){
	   country = newCountry;
   }

}