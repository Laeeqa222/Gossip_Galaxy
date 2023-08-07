package com.gossipgalaxy.gossip.Entity;
import java.sql.Timestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="status")
@Data
public class Status {
    @Id
    @GeneratedValue
    private int id;
    private String userId;
    private String userName;
    private String statusId;
    private String path;
    private Timestamp timestamp;
}
