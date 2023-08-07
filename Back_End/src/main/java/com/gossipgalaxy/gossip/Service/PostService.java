package com.gossipgalaxy.gossip.Service;
import com.gossipgalaxy.gossip.Entity.Post;
import com.gossipgalaxy.gossip.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
@Service
public class PostService {
    @Autowired
    UserService userService;
    @Autowired
    PostRepository postRepository;
    public Post postPost(Post post){
        return postRepository.save(post);
    }
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> l=postRepository.findAll();
        l.stream().forEach(s->{
            s.setUserName(userService.getDetails(s.getUserId()).getUserName());
        });
        Collections.sort(l,(a,b)->b.getId()-a.getId());
        return l;
    }
}
