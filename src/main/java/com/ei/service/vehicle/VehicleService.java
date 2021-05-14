package com.ei.service.vehicle;

import com.ei.entity.VehicleEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VehicleService {

    VehicleEntity save(VehicleEntity map);

    List<VehicleEntity> findAll();

    List<VehicleEntity> findByType(long id);

    List<VehicleEntity> findByBrand(long id);

    VehicleEntity findById(long id);

    void deleteById(long id);

    VehicleEntity update(VehicleEntity vehicleEntity, long id);
}
