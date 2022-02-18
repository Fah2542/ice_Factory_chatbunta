package nvc.it.test_springboot.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvc.it.test_springboot.model.Camera;
import nvc.it.test_springboot.model.Events;
import nvc.it.test_springboot.service.CameraService;

@RestController
@RequestMapping("/camera")
public class CameraController {
    
    @Autowired
    private CameraService cameraService;

    @GetMapping("")
    public ResponseEntity<Object> getAllCamera(){
        List<Camera> cameras = cameraService.getCamera();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Success");
        map.put("data", cameras);
        return new ResponseEntity<Object>(map, HttpStatus.OK); 
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getCameraById(){
        List<Camera> cameras = cameraService.getCamera();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Success");
        map.put("data", cameras);
        return new ResponseEntity<Object>(map, HttpStatus.OK); 
    }
    @PostMapping("")
    public ResponseEntity<Object> addCamera(@RequestBody Camera camera){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Camera Success!");
        map.put("data", cameraService.addCamera(camera));
        return new ResponseEntity<Object>(map,HttpStatus.OK);
    };
    @PatchMapping("/{id}")
    public ResponseEntity<Object> addEvents(@PathVariable String id, @RequestBody Events events){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Review Success!");
        map.put("data", cameraService.addEvent(id, events));
        return new ResponseEntity<Object>(map,HttpStatus.OK);
    }
    

}
