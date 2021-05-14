package com.ei.service.vehicle;

import com.ei.entity.VehicleEntity;

import java.util.List;

public interface VehicleService {

    VehicleEntity save(VehicleEntity map);

    List<VehicleEntity> findAll();

    List<VehicleEntity> findByType(long id);

    List<VehicleEntity> findByBrand(long id);
}
