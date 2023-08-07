package com.gossipgalaxy.gossip.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.gossipgalaxy.gossip.Entity.Users;
import com.gossipgalaxy.gossip.Service.UserService;
@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    UserService userService;
    @PostMapping("")
    private boolean submitUserDetails(@RequestBody Users users){
        userService.submitDetails(users);
        return true;
    }
    @GetMapping("/{userid}")
    private Users getUsersDetails(@PathVariable("userid") String userId){
        Users user=userService.getDetails(userId);
    return user;
    }
    @GetMapping("")
    private ArrayList<Users> getAllUser(){
        ArrayList<Users> user=userService.getAllUsers();
    return user;
    }
}

