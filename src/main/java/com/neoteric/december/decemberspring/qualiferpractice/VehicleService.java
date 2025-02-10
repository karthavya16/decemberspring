package com.neoteric.december.decemberspring.qualiferpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VehicleService {
    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;

    public void service(){
        vehicle.start();
    }
}
