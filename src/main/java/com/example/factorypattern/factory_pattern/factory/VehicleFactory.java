package com.example.factorypattern.factory_pattern.factory;

import com.example.factorypattern.factory_pattern.enginees.EngineTypeVariety;
import com.example.factorypattern.factory_pattern.vehicles.*;

public class VehicleFactory {

    private VehicleFactory(){

    }

    public static Vehicle makeVehicle(VehicleBrands brand, VehicleColors color, EngineTypeVariety engineType) {

       switch(brand) {
           case VehicleBrands.NISSAN:
               return new NissanVehicle(color, engineType);
           case VehicleBrands.HONDA:
               return new HondaVehicle(color, engineType);
           default:
               throw new IllegalArgumentException("unknown vehicle brand: " + brand);

       }

    }

}
