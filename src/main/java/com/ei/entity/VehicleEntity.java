package com.ei.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Name should not be null")
    @NotEmpty(message = "Name should not be empty")
    private String name;
    @NotNull(message = "Fuel type should not be null")
    @NotEmpty(message = "Fuel type should not be empty")
    private String fuelType;
    @NotNull(message = "Max speed should not be null")
    @NotEmpty(message = "Max speed should not be empty")
    private String maxSpeed;

    @OneToOne
    private VehicleTypeEntity vehicleType;

    @ManyToOne
    private VehicleBrandEntity vehicleBrand;
}


