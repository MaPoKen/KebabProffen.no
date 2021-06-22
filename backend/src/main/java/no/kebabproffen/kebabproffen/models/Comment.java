package no.kebabproffen.kebabproffen;

import javax.persistence.*;
import java.time.LocalDateTime;  
import java.util.*;

@Entity
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue
    private final int commentId;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private final User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private final Restaurant restaurant;

    private final String comment;

    private final LocalDateTime created;

    private final LocalDateTime edited;


    public Comment(int commentId, User user, String comment, LocalDateTime created, LocalDateTime edited, Restaurant restaurant){
        this.commentId = commentId;
        this.user = user;
        this.comment = comment;
        this.created = created;
        this.edited = edited;
        this.restaurant = restaurant;
    };

    public int getCommentId(){
    	return commentId;
    }
    
    public User getUser(){
    	return user;
    }
    
    public void setUser(User newUser){
    	user = newUser;
    }
    
    public String getComment(){
    	return comment;
    }

    public void setComment(String newComment){
    	comment = newComment;
    }
    
    public LocalDateTime getCreated(){
    	return created;
    }

    public void setCreated(LocalDateTime newCreated){
    	created = newCreated;
    }

    public LocalDateTime getEdited(){
    	return edited;
    }
    
   public void setEdited(LocalDateTime newEdited){
	   edited = newEdited;
   }
   
   public Restaurant getRestaurant(){
	   return restaurant;
   }
   
   public void setRestaurant(Restaurant newRestaurant){
	   restaurant = newRestaurant;
   }
}