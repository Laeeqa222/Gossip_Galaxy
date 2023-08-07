package com.gossipgalaxy.gossip.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gossipgalaxy.gossip.Repository.CommentRepository;
import com.gossipgalaxy.gossip.Entity.Comment;
import java.util.ArrayList;
@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
  @Autowired
    UserService userService;
    public Comment postComment(Comment comment){
         return commentRepository.save(comment);
    }
    public ArrayList<Comment> getComments(){
        ArrayList<Comment>l=commentRepository.findAll();
        l.stream().forEach(s->{
            s.setUserName(userService.getDetails(s.getUserId()).getUserName());
        });
        return l;
    }
    public ArrayList<Comment> getCommentsByPostId(String postId){
        ArrayList<Comment>l=commentRepository.findByPostId(postId);
        l.stream().forEach(s->{
            s.setUserName(userService.getDetails(s.getUserId()).getUserName());
        });
        return l;
    }
}
