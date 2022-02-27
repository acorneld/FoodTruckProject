package com.skilldistillery.foodtruck;


public class FoodTruck {

	private static int numericId = 1;
	private String foodTruckName;
	private String foodType;
	private double foodTruckRating;

	public FoodTruck() {
	}

	public FoodTruck(String foodTruckName, String foodType, double foodTruckRating) {
		FoodTruck.numericId = numericId;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.foodTruckRating = foodTruckRating;
		numericId++;
	}

	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		FoodTruck.numericId = numericId;
	}

	public String getFoodTruckName() {
		
			return foodTruckName;
		}
	

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(double foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	public String toString() {
		String output = "Numeric ID:" + numericId + " Food Truck Name:" + foodTruckName + " Food type:" + foodType
				+ " Rating:" + foodTruckRating;
		return output;
	}
	public void displayFoodTruck() {
		String truckData = this.toString();
		System.out.println(truckData);
	}
	
	
}
