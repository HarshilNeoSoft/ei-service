package com.ei.controller;

import com.ei.entity.VehicleEntity;
import com.ei.service.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody VehicleEntity vehicleEntity) {
        VehicleEntity entity = vehicleService.save(vehicleEntity);
        return new ResponseEntity<>("Data saved " + entity.getId(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody VehicleEntity vehicleEntity, @PathVariable long id) {
        VehicleEntity entity = vehicleService.update(vehicleEntity, id);
        return new ResponseEntity<>("Data updated " + entity.getId(), HttpStatus.OK);
    }

    @GetMapping
    public CompletableFuture<List<VehicleEntity>> findAll() {
        return vehicleService.findAll();
    }

    @GetMapping("/type/{id}")
    public List<VehicleEntity> findByType(@PathVariable long id) {
        return vehicleService.findByType(id);
    }

    @GetMapping("/brand/{id}")
    public List<VehicleEntity> findByBrand(@PathVariable long id) {
        return vehicleService.findByBrand(id);
    }

    @GetMapping("/{id}")
    public VehicleEntity getVehicleDetails(@PathVariable long id) {
        return vehicleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable long id) {
        vehicleService.deleteById(id);
    }
}
