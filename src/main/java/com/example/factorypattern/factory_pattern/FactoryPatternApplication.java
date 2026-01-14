package com.example.factorypattern.factory_pattern;

import com.example.factorypattern.factory_pattern.enginees.EngineTypeVariety;
import com.example.factorypattern.factory_pattern.factory.VehicleFactory;
import com.example.factorypattern.factory_pattern.vehicles.Vehicle;
import com.example.factorypattern.factory_pattern.vehicles.VehicleBrands;
import com.example.factorypattern.factory_pattern.vehicles.VehicleColors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FactoryPatternApplication {

	public static void main(String[] args) {


		SpringApplication.run(FactoryPatternApplication.class, args);

	    Vehicle vehicleOne = VehicleFactory.makeVehicle(VehicleBrands.HONDA.toString(), VehicleColors.BLACK.toString(), EngineTypeVariety.GAS.toString());

		log.info("The object returned is of  " + vehicleOne.getClass().toString());
		log.info("The vehicle is " + vehicleOne.color());
		log.info("The vehicle has a " + vehicleOne.checkEngineType().engineType());

		Vehicle vehicleTwo = VehicleFactory.makeVehicle(VehicleBrands.NISSAN.toString(), VehicleColors.SILVER.toString(), EngineTypeVariety.SOLAR.toString());

		log.info("The object returned is of  " + vehicleTwo.getClass().toString());
		log.info("The vehicle is " + vehicleTwo.color());
		log.info("The vehicle has a " + vehicleTwo.checkEngineType().engineType());

	}

}
