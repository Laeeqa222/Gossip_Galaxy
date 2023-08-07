package com.gossipgalaxy.gossip.Service;
import com.gossipgalaxy.gossip.Entity.Status;
import com.gossipgalaxy.gossip.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class StatusService {
    @Autowired
    UserService userService;
    @Autowired
    StatusRepository statusRepository;
    public Status submitData(Status status){
        return statusRepository.save(status);
    }
    public ArrayList<Status> getAllStatus(){
        ArrayList<Status>l=statusRepository.findAll();
        l.stream().forEach(s->{
            s.setUserName(userService.getDetails(s.getUserId()).getUserName());
        });
        return l;
    }
}
