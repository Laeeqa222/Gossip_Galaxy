package com.gossipgalaxy.gossip.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import com.gossipgalaxy.gossip.Entity.Post;
@Repository
public interface PostRepository extends  CrudRepository<Post, Integer>{
    Post save(Post post);
    ArrayList<Post> findAll();
}
