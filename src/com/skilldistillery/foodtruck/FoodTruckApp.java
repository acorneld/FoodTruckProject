package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruck[] truckArray = new FoodTruck[5];

		for (int i = 0; i < truckArray.length; i++) {

			FoodTruck ft1 = new FoodTruck();
			System.out.println("Please enter the name of the Foodtruck: ");
			String truckName = kb.nextLine();
			if (truckName.equals("quit")) {
				break;

			} else {
				ft1.setFoodTruckName(truckName);
			}
			System.out.println("Please enter the type of food served: ");
			String foodTypeName = kb.nextLine();
			ft1.setFoodType(foodTypeName);
			System.out.println("Please enter a rating of 1-10 ");
			int foodTruckRatingName = kb.nextInt();
			System.out.println("");
			ft1.setFoodTruckRating(foodTruckRatingName);

			String ft1Data = ft1.toString();
			ft1.displayFoodTruck(ft1Data);
		}

		kb.close();
	}

}
