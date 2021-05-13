package com.ei.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String fuelType;
    private String maxSpeed;

    @OneToOne
    private VehicleTypeEntity vehicleType;

    @ManyToOne
    private VehicleBrandEntity vehicleBrand;
}


