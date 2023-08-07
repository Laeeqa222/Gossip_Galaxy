package com.gossipgalaxy.gossip.Entity;
import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="comment")
@Data
public class Comment {
    
    @Id
    @GeneratedValue
    private int id;
    private String commentId;
    private String postId;
    private String userId;
    private String userName;
    private Timestamp timestamp;
    private String comment;
}
