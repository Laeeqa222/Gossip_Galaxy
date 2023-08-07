package com.gossipgalaxy.gossip.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gossipgalaxy.gossip.Entity.Comment;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import com.gossipgalaxy.gossip.Service.CommentService;
@RestController
@RequestMapping("/comments")
public class commentController {
    
    @Autowired
    CommentService commentService;
    @PostMapping("")
    public Comment postComment(@RequestBody Comment comment ){
        return commentService.postComment(comment);
    }
    @GetMapping("/{postId}")
    public ArrayList<Comment> getCommentsByPostId(@PathVariable("postId") String postId ){
        return commentService.getCommentsByPostId(postId);
    }
    @GetMapping("")
    public ArrayList<Comment> getAllComment( ){
        return commentService.getComments();
    }
}
