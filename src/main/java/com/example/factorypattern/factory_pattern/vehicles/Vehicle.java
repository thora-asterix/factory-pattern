package com.example.factorypattern.factory_pattern.vehicles;

import com.example.factorypattern.factory_pattern.enginees.EngineType;

public interface Vehicle {


    public String type();

    public String color();

   // public EngineType engine(String engineType);

    public EngineType checkEngineType();

}
