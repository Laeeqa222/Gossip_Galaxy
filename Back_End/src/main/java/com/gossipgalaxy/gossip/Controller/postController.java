package com.gossipgalaxy.gossip.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gossipgalaxy.gossip.Entity.Post;
import com.gossipgalaxy.gossip.Service.PostService;

import java.util.ArrayList;
@RestController
@RequestMapping("/post")
public class postController {
    @Autowired
    PostService postService;
    @PostMapping("")
    public Post submitPost(@RequestBody Post post){
        return postService.postPost(post);
    }
    @GetMapping("")
    public ArrayList<Post> getAllPost(){
        return postService.getAllPosts();
    }
}
