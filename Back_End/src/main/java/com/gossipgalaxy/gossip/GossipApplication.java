package com.gossipgalaxy.gossip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GossipApplication {
	public static void main(String[] args) {
		SpringApplication.run(GossipApplication.class, args);
	}
//gossipgalaxy
}
//rules_version = '2';
/*service firebase.storage {
    match /b/{bucket}/o {
        match /{allPaths=**} {
            allow read, write: if true;
    }
  }
}//*/
