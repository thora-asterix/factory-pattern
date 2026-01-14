package com.example.factorypattern.factory_pattern.enginees;

import lombok.Data;

@Data
public class GasPoweredEngineType implements EngineType {

    private int tank;

    public GasPoweredEngineType(){
        tank = 0;
    }
    @Override
    public String engineType() {
        return "Gas Powered Engine";
    }

    public void setFillEngineTank(int gallonSize){
        this.tank = gallonSize;
    }

}
