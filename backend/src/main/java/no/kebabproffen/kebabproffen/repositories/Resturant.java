package no.kebabproffen.kebabproffen;

import no.kebabproffen.kebabproffen.*;
import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "resturant")
class Resturant {

    @Id
    @GeneratedValue
    private int resturantId;
    
    @ManyToOne
    private Location location;

    private String name;
    
    private String resturantType;

    public Resturant(int resturantId, Location location, String name, String resturantType){
        this.resturantId = resturantId;
        this.location = location;
        this.name = name;
        this.resturantType = resturantType;
    } 
}