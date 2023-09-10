package com.example.jpademo.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.entity.station;
import com.example.jpademo.service.StationService;


@RestController
public class studentcontroler {

    @Autowired
    private StationService stnService;

    @PostMapping
    public ResponseEntity<station> saveStation(@RequestBody station stn){
        stnService.saveStation(stn);
        return new ResponseEntity<>(stn, HttpStatus.CREATED);
    }

    @GetMapping("/station/{id}")
    public ResponseEntity<station> getStationById(@PathVariable Integer id){

        return new ResponseEntity<station>(stnService.getStationById(id), HttpStatus.OK);

    }
    
}
