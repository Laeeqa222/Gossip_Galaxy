package com.gossipgalaxy.gossip.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gossipgalaxy.gossip.Entity.Users;
import java.util.ArrayList;
@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    Users save(Users users);
    Users findByUserId(String userId);
    ArrayList<Users> findAll();
}
