package no.kebabproffen.kebabproffen;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "restaurant")
class Restaurant {

    @Id
    @GeneratedValue
    private int restaurantId;
    
    @ManyToOne
    private Location location;

    private String name;
    
    private String type;

    public Restaurant(int restaurantId, Location location, String name, String restaurantType){
        this.restaurantId = restaurantId;
        this.location = location;
        this.name = name;
        this.type = restaurantType;
    } 
    
    public int getRestaurantId(){
    	return restaurantId;
    }
    
    public Location getLocation(){
    	return location;
    }
    
    public void setLocation(Location newLocation){
    	location = newLocation;
    }
    
    public String getName(){
    	return name;
    }

    public void setName(String newName){
    	name = newName;
    }
    
    public String getType(){
    	return type;
    }

    public void setType(String newType){
    	type = newType;
    }
}