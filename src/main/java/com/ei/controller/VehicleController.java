package com.ei.controller;

import com.ei.entity.VehicleEntity;
import com.ei.service.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody VehicleEntity vehicleEntity) {
        VehicleEntity entity = vehicleService.save(vehicleEntity);
        return new ResponseEntity<>("Data saved " + entity.getId(), HttpStatus.OK);
    }
}
