package com.example.factorypattern.factory_pattern.enginees;

public enum EngineTypeVariety {

    SOLAR("solar"),
    ELECTRIC("electric"),
    GAS("gas");

    private final String value;

    EngineTypeVariety(String value){
        this.value = value;
    }
}
