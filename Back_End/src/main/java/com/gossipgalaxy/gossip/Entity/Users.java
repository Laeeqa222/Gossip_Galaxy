package com.gossipgalaxy.gossip.Entity;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Entity(name="Users")
@Data
public class Users {
    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String userId;
    private String userName;
    private String name;
    private String profileImage;
}
