package nvc.it.test_springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.test_springboot.model.Camera;
import nvc.it.test_springboot.model.Events;
import nvc.it.test_springboot.repository.CameraRepository;

@Service
public class CameraService {
    
    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCamera(){
        return cameraRepository.findAll();
    }
    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }
    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }
    public Optional<Camera> addEvent(String id, Events event){
        Camera currentCamera = cameraRepository.findById(id).get();
        List<Events> events = currentCamera.getEvents();
        events.add(event);
        currentCamera.setEvents(events);

        return Optional.of(cameraRepository.save(currentCamera));
    }
}
