package com.ei.repository;

import com.ei.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

    List<VehicleEntity> findByVehicleType_Id(long id);

    List<VehicleEntity> findByVehicleBrand_Id(long id);
}
