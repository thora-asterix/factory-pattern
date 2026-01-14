package com.example.factorypattern.factory_pattern.vehicles;

public enum VehicleColors {
    RED("red"),
    SILVER("silver"),
    BLACK("black"),
    BLUE("blue");

    private final String value;

    VehicleColors(String value){
        this.value = value;
    }
}
