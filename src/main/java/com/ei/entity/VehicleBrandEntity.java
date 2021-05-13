package com.ei.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "vehicle_brand")
public class VehicleBrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
