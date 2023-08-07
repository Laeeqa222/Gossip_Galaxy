package com.gossipgalaxy.gossip.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gossipgalaxy.gossip.Entity.Status;
import com.gossipgalaxy.gossip.Service.StatusService;
@RestController
@RequestMapping("/status")
public class statusController {
    @Autowired
    StatusService statusService;
    @PostMapping("")
    public Status submitStatus(@RequestBody Status status){
        return statusService.submitData(status);
    }
    @GetMapping("")
    public ArrayList<Status> getAllStatus(){
        return statusService.getAllStatus();
    }
}
