package com.example.factorypattern.factory_pattern;

import com.example.factorypattern.factory_pattern.enginees.EngineTypeVariety;
import com.example.factorypattern.factory_pattern.factory.VehicleFactory;
import com.example.factorypattern.factory_pattern.vehicles.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FactoryPatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(FactoryPatternApplication.class, args);

	    HondaVehicle vehicleOne = (HondaVehicle) VehicleFactory.makeVehicle(VehicleBrands.HONDA, VehicleColors.BLACK, EngineTypeVariety.GAS);

		log.info("The object returned is of  " + vehicleOne.getClass());
		log.info("The vehicle is " + vehicleOne.color());
		log.info("The vehicle has a " + vehicleOne.checkEngineType().engineType());

		NissanVehicle vehicleTwo = (NissanVehicle) VehicleFactory.makeVehicle(VehicleBrands.NISSAN, VehicleColors.SILVER, EngineTypeVariety.SOLAR);
		log.info("The object returned is of  " + vehicleTwo.getClass());
		log.info("The vehicle is " + vehicleTwo.color());
		log.info("The vehicle has a " + vehicleTwo.checkEngineType().engineType());

	}

}
