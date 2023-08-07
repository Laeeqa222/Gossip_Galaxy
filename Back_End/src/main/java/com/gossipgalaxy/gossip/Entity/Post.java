package com.gossipgalaxy.gossip.Entity;
import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="Post")
@Data
public class Post {

@Id
@GeneratedValue
private int id;
private String postId;
private String userId;
private String userName;
private String postPath;
private Timestamp timeStamp;
private int likeCount;
}