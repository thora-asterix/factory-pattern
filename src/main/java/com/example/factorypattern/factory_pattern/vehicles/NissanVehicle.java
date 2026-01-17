package com.example.factorypattern.factory_pattern.vehicles;

import com.example.factorypattern.factory_pattern.enginees.EngineType;
import com.example.factorypattern.factory_pattern.enginees.EngineTypeVariety;
import com.example.factorypattern.factory_pattern.enginees.GasPoweredEngineType;
import com.example.factorypattern.factory_pattern.enginees.SolarFuelEngineType;

public class NissanVehicle implements Vehicle {

    final private String color;
    final private EngineType engineType;
    final private String type;


    public NissanVehicle(VehicleColors color, EngineTypeVariety engineType){
        this.color = color.toString();
        this.engineType = this.engine(engineType);
        this.type = "Nissan";
    }
    @Override
    public String type() {
        return this.type;
    }

    @Override
    public String color() {
        return this.color;
    }

    private EngineType engine(EngineTypeVariety engineType) {

       // EngineTypeVariety engineTypeVariety = EngineTypeVariety.valueOf(engineType);

        if(engineType == EngineTypeVariety.SOLAR){
            return new SolarFuelEngineType();
        } else if(engineType == EngineTypeVariety.GAS){
            return new GasPoweredEngineType();
        } else if(engineType == EngineTypeVariety.ELECTRIC) {
            return new SolarFuelEngineType();
        }
        return new GasPoweredEngineType();
    }

    @Override
    public EngineType checkEngineType(){
        return this.engineType;
    }

}
