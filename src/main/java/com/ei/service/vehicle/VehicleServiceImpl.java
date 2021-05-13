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
}
