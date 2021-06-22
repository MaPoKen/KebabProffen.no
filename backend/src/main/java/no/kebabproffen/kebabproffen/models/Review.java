package no.kebabproffen.kebabproffen;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "review")
class Review {
    
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private UUID reviewId;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    
    private String title;
    
    private String review;
    
    private int rating;

    public Review(UUID reviewId, User user, Restaurant restaurant, String review, String title, int rating){
        this.reviewId = reviewId;
        this.user = user;
        this.restaurant = restaurant;
        this.review = review;
        this.rating = rating;
    }

    public UUID getReviewId(){
    	return reviewId;
    }
    
    public User getUser(){
    	return user;
    }
    
    public void setUser(User newUser){
    	user = newUser;
    }
    
    public Restaurant getRestaurant(){
 	   return restaurant;
    }
    
    public void setRestaurant(Restaurant newRestaurant){
 	   restaurant = newRestaurant;
    }
    
    public String getTitle(){
    	return title;
    }

    public void setTitle(String newTitle){
    	title = newTitle;
    }
    
    public String getReview(){
    	return review;
    }

    public void setReview(String newReview){
    	review = newReview;
    }

    public int getRating(){
    	return rating;
    }
    
   public void setRating(int newRating){
	   rating = newRating;
   }
}
