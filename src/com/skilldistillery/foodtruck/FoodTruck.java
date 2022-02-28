package com.skilldistillery.foodtruck;

public class FoodTruck {

	private static int numericIdGenerator = 1;
	private int numericId;
	private String foodTruckName;
	private String foodType;
	private double foodTruckRating;
	private double averageTotal = 0;

	public FoodTruck() {
	}

	public FoodTruck(String foodTruckName, String foodType, double foodTruckRating) {
		this.numericId = numericIdGenerator;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.foodTruckRating = foodTruckRating;
		numericIdGenerator++;

	}

	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
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

	public FoodTruck(double averageTotal) {
		this.averageTotal = averageTotal;
	}

	public double getAverageTotal() {
		return averageTotal;
	}

	public void setAverageTotal(double averageTotal) {
		this.averageTotal = averageTotal;
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
