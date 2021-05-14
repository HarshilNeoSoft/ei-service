package com.ei.service.vehicle;

import com.ei.entity.VehicleEntity;
import com.ei.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository repository;

    @Override
    @Transactional
    public VehicleEntity save(VehicleEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<VehicleEntity> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<VehicleEntity> findByType(long id) {
        return repository.findByVehicleType_Id(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<VehicleEntity> findByBrand(long id) {
        return repository.findByVehicleBrand_Id(id);
    }

    @Override
    @Transactional(readOnly = true)
    public VehicleEntity findById(long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("No data found"));
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public VehicleEntity update(VehicleEntity vehicleEntity, long id) {
        vehicleEntity.setId(id);
        return repository.save(vehicleEntity);
    }


}
