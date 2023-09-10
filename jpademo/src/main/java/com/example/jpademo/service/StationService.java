package com.example.jpademo.service;
import com.example.jpademo.entity.station;

public interface StationService {
    
    public station saveStation(station stn);
    public station getStationById(Integer id);
}
