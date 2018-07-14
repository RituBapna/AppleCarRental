package com.apple.carrental.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.apple.carrental.bean.Car;
import com.apple.carrental.response.mapper.Mapper;
import com.apple.carrental.service.CarService;

public class CarRentalSearch {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Map<String,Car> carMap = Mapper.getJsonArrayToMap();
		
		List<Car> blueTeslaCars = CarService.printBlueTeslaAndNotes(carMap);
		System.out.println("There are " + blueTeslaCars.size() +" Blue Tesla Cars:\n");
		CarService.printCars(blueTeslaCars);
		List<Car> lpdrCars = CarService.getLowestPerDayRentalCars(carMap);
		System.out.println("There are " + lpdrCars.size() +" cars with lowest per day rental price :\n");
		CarService.printCars(lpdrCars);
		List<Car> lpdradCars = CarService.getLowestPerDayRentalCarsAfterDiscount(carMap);
		System.out.println("There are " + lpdradCars.size() +" cars with lowest per day rental price after discount :\n");
		CarService.printCars(lpdradCars);
		List<Car> hrgCars = CarService.printHighestRevenueGeneratingCar(carMap);
		System.out.println("There is " + hrgCars.size() +" highest revenue generating car :\n");
		CarService.printCars(hrgCars);
	}

}
