package nvc.it.test_springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.xml.crypto.Data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("cameras")
@Getter @Setter @NoArgsConstructor
public class Camera {
    private String name;
    private String location;
    


    private List<Events> events = new ArrayList<Events>();
    
    @CreatedDate
    private Data createdAt;

    @LastModifiedBy 
    private Date updatedAt;

}


