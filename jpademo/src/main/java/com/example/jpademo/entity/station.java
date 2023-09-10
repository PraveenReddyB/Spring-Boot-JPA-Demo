package com.example.jpademo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stations")
public class station {

    @Id
    @Column(name="stationID") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Integer stationID;
    
    @Column(name="name") 
    private String name;

    @Column(name="type") 
    private String type;
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

  
}
