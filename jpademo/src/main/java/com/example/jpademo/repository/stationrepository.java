package com.example.jpademo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.jpademo.entity.station;

public interface stationrepository extends CrudRepository<station, Integer>{
    
}
