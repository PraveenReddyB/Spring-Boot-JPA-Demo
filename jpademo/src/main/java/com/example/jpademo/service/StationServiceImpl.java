package com.example.jpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpademo.entity.station;
import com.example.jpademo.repository.stationrepository;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    stationrepository stnrepo;

    @Override
    public station saveStation(station stn){
        stnrepo.save(stn);
        return stn;
    }

    @Override
    public station getStationById(Integer id){
        return stnrepo.findById(id).get();
    }
    
}
