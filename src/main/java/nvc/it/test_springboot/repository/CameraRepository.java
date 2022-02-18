package nvc.it.test_springboot.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.test_springboot.model.Camera;

public interface CameraRepository  extends MongoRepository<Camera, String>{
    public List<Camera> findByNameContaining(String name);

   

   

   
}
