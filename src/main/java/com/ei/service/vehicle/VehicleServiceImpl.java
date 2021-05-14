package com.ei.service.vehicle;

import com.ei.entity.VehicleEntity;
import com.ei.exception.types.InternalException;
import com.ei.exception.types.NotFoundException;
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
        try {
            return this.repository.save(entity);
        } catch (RuntimeException e) {
            throw new InternalException(e.getMessage());
        }
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
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Vehicle not found"));
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        try {
            repository.deleteById(id);
        } catch (RuntimeException e) {
            throw new NotFoundException(e.getLocalizedMessage());
        }
    }

    @Override
    @Transactional
    public VehicleEntity update(VehicleEntity vehicleEntity, long id) {
        findById(id);
        vehicleEntity.setId(id);
        return repository.save(vehicleEntity);
    }


}
