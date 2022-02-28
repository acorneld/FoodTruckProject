package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruck[] truckArray = new FoodTruck[5];

		for (int i = 0; i < truckArray.length; i++) {
			FoodTruck newFoodTruck = new FoodTruck();
			System.out.println("Please enter the name of the Foodtruck: ");
			String foodTruckName = kb.nextLine();
			if (foodTruckName.equalsIgnoreCase("quit")) {
				continue;

			} else {

				System.out.println("Please enter the type of food served: ");
				String foodTypeName = kb.nextLine();
				System.out.println("Please enter a rating of 1-5: ");
				int foodTruckRatingName = kb.nextInt();
				kb.nextLine();

				truckArray[i] = new FoodTruck(foodTruckName, foodTypeName, foodTruckRatingName);
			}
		}

		int userInput = 0;
		while (userInput >= 0 && userInput < 5) {

			System.out.println("\t  MENU OPTIONS");
			System.out.println("1. List all existing food trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the highest rated food truck.");
			System.out.println("4. Quit!");
			userInput = kb.nextInt();
			if (userInput == 4) {
				break;
			} else if (userInput == 3) {

				FoodTruck topRating = truckArray[0];

				for (int x = 0; x < truckArray.length; x++) {
					if (truckArray[x] != null) {

						if (truckArray[x].getFoodTruckRating() > topRating.getFoodTruckRating()) {
							topRating = truckArray[x];
						}
					}
				}

				System.out.println(topRating.toString());
			}

			else if (userInput == 2) {
				double averageSum = 0;
				int count = 0;
				for (int i = 0; i < truckArray.length; i++) {
					if (truckArray[i] == null) {
						continue;
					}
					averageSum += truckArray[i].getFoodTruckRating();
					count++;
				}
				double averageTotal = averageSum / count;
				System.out.println(averageTotal);
			} else if (userInput == 1) {
				for (int x = 0; x < truckArray.length; x++) {
					if (truckArray[x] == null) {
						continue;
					}
					System.out.println(truckArray[x].toString());

				}
			}

		}

	}

}
