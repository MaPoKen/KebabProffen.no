package no.kebabproffen.kebabproffen;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user") 
class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private UUID userId;

    private String username;

    private String hashedPassword;

    private String email;

    public User(UUID userId, String username, String hashedPassword, String email){
        this.userId = userId;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.email = email;
    }



}