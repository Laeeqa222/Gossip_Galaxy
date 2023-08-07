package com.gossipgalaxy.gossip.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import com.gossipgalaxy.gossip.Entity.Status;
@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {
    Status save(Status status);
    ArrayList<Status> findAll();
}
