package com.gossipgalaxy.gossip.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.gossipgalaxy.gossip.Entity.Users;
import com.gossipgalaxy.gossip.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;
    public Users submitDetails(Users users){
        return userRepository.save(users);
    }
    public Users getDetails(String userId){
        return  userRepository.findByUserId(userId);
    }
    public ArrayList<Users> getAllUsers(){
         return userRepository.findAll();
    }
}
