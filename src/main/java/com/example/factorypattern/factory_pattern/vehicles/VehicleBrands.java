package com.example.factorypattern.factory_pattern.vehicles;

public enum VehicleBrands {
    HONDA("honda"),
    NISSAN("nissan");

    private final String value;

    VehicleBrands(String value){
        this.value = value;
    }
}
