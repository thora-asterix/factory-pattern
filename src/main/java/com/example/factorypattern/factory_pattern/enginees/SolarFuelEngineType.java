package com.example.factorypattern.factory_pattern.enginees;

import lombok.Data;

@Data
public class SolarFuelEngineType implements EngineType {

    private int solarCharge;

    public SolarFuelEngineType(){
        this.solarCharge = 0;
    }
    @Override
    public String engineType() {
        return "Solar Powered Engine";
    }

    public void setSolarCharge(int hours){
        this.solarCharge = hours;
    }
}
