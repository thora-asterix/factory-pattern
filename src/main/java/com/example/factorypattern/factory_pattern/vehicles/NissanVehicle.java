package com.example.factorypattern.factory_pattern.vehicles;

import com.example.factorypattern.factory_pattern.enginees.EngineType;
import com.example.factorypattern.factory_pattern.enginees.EngineTypeVariety;
import com.example.factorypattern.factory_pattern.enginees.GasPoweredEngineType;
import com.example.factorypattern.factory_pattern.enginees.SolarFuelEngineType;

public class NissanVehicle implements Vehicle {

    final private String color;
    final private EngineType engineType;


    public NissanVehicle(String color, String engineType){
        this.color = color;
        this.engineType = this.engine(engineType);
    }
    @Override
    public String type() {
        return "NISSAN";
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public EngineType engine(String engineType) {

        EngineTypeVariety engineTypeVariety = EngineTypeVariety.valueOf(engineType);

        if(engineTypeVariety == EngineTypeVariety.SOLAR){
            return new SolarFuelEngineType();
        } else if(engineTypeVariety == EngineTypeVariety.GAS){
            return new GasPoweredEngineType();
        } else if(engineTypeVariety == EngineTypeVariety.ELECTRIC) {
            return new SolarFuelEngineType();
        }
        return new GasPoweredEngineType();
    }

    @Override
    public EngineType checkEngineType(){
        return this.engineType;
    }

}
