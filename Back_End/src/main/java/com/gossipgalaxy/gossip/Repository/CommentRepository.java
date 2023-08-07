package com.gossipgalaxy.gossip.Repository;
import org.springframework.stereotype.Repository;

import com.gossipgalaxy.gossip.Entity.Comment;

import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {
    Comment save(Comment comment);
    ArrayList<Comment> findAll();
    ArrayList<Comment> findByPostId(String postId);
}
