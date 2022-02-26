package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruck[] truckArray = new FoodTruck[6];

		for (int i = 1; i < truckArray.length; i++) {
			FoodTruck newFoodTruck = new FoodTruck();
			newFoodTruck.getNumericId();
			newFoodTruck.setNumericId(i);
			
			System.out.println("Please enter the name of the Foodtruck: ");
			String truckName = kb.nextLine();
			if (truckName.equals("quit")) {
				continue;

			} else {

				newFoodTruck.setFoodTruckName(truckName);
				System.out.println("Please enter the type of food served: ");
				String foodTypeName = kb.nextLine();
				newFoodTruck.setFoodType(foodTypeName);
				System.out.println("Please enter a rating of 1-10 ");
				int foodTruckRatingName = kb.nextInt();
				kb.nextLine();
				newFoodTruck.setFoodTruckRating(foodTruckRatingName);

				String ft1Data = newFoodTruck.toString();
				newFoodTruck.displayFoodTruck(ft1Data);

				truckArray[i] = newFoodTruck;
			}
		}
			int userInput = 0;
			while(userInput != 4) {
				
			System.out.println("\t  MENU OPTIONS");
			System.out.println("1. List all existing food trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the highest rated food truck.");
			System.out.println("4. Quit!");
			userInput = kb.nextInt();
			if(userInput == 4) {
				break;
			}
			else if(userInput == 3) {
				
		}
}
			System.out.println();
		

		kb.close();
	}

}
