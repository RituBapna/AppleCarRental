package com.apple.interview.carrental;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.apple.carrental.bean.Car;
import com.apple.carrental.response.mapper.Mapper;
import com.apple.carrental.service.CarService;

public class CarTest {

	@Test
	public void testBlueTesla() throws IOException {

		Map<String, Car> carMap = Mapper.getJsonArrayToMap();
		
		for (Car car : CarService.printBlueTeslaAndNotes(carMap)) {
			Assert.assertEquals(car.getMake(), "Tesla");
			Assert.assertEquals(car.getMetadata().getColor(), "Blue");
		}
		
	}
	
	@Test
	public void testLowestPricePerDay() throws IOException {

		Map<String, Car> carMap = Mapper.getJsonArrayToMap();
		
		for (Car car : CarService.getLowestPerDayRentalCars(carMap)) {
			Assert.assertNotNull(car.getPerdayrent());
		}
		
	}
	
	@Test
	public void testLowestPriceAfterDiscount() throws IOException {

		Map<String, Car> carMap = Mapper.getJsonArrayToMap();
		
		for (Car car : CarService.getLowestPerDayRentalCarsAfterDiscount(carMap)) {
			Assert.assertNotNull(car.getPerdayrent());
		}
		
	}
	
	@Test
	public void testLowestPriceAfterDisco() throws IOException {

		Map<String, Car> carMap = Mapper.getJsonArrayToMap();
		
		for (Car car : CarService.printHighestRevenueGeneratingCar(carMap)) {
			Assert.assertNotNull(car.getPerdayrent());
		}
		
	}

}
