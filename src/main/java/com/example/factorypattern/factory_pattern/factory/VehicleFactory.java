package com.example.factorypattern.factory_pattern.factory;

import com.example.factorypattern.factory_pattern.vehicles.HondaVehicle;
import com.example.factorypattern.factory_pattern.vehicles.NissanVehicle;
import com.example.factorypattern.factory_pattern.vehicles.Vehicle;
import com.example.factorypattern.factory_pattern.vehicles.VehicleBrands;

public class VehicleFactory {

    private VehicleFactory(){

    }

    public static Vehicle makeVehicle(String brand, String color, String engineType) {

       switch(brand) {
           case "NISSAN":
               return new NissanVehicle(color, engineType);
           case "HONDA":
               return new HondaVehicle(color, engineType);
           default:
               throw new IllegalArgumentException("Uknown vehicle brand: " + brand);

       }

    }

}
