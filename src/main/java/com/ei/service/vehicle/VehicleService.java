package com.ei.service.vehicle;

import com.ei.entity.VehicleEntity;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface VehicleService {

    VehicleEntity save(VehicleEntity map);

    CompletableFuture<List<VehicleEntity>> findAll();

    List<VehicleEntity> findByType(long id);

    List<VehicleEntity> findByBrand(long id);

    VehicleEntity findById(long id);

    void deleteById(long id);

    VehicleEntity update(VehicleEntity vehicleEntity, long id);
}
