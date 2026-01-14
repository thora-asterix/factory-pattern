package com.example.factorypattern.factory_pattern.enginees;

import lombok.Data;

@Data
public class ElectricFuelEngineType implements EngineType {

    private int hourEletricCharge;

    public ElectricFuelEngineType(){
        hourEletricCharge = 0;
    }

    @Override
    public String engineType() {
        return "Electric Powered Fuel Engine";
    }

    public void setHourEletricCharge(int hours){
        this.hourEletricCharge = hours;
    }
}
