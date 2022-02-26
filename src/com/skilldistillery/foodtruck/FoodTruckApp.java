package com.skilldistillery.foodtruck;
import java.util.Scanner;
public class FoodTruckApp {
	
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		FoodTruck ft1 = new FoodTruck();
		ft1.setNumericId(1);
		System.out.println("Please enter the name of the Foodtruck: ");
		ft1.setFoodTruckName(kb.nextLine());
		System.out.println("Please enter the type of food served: ");
		ft1.setFoodType(kb.nextLine());
		System.out.println("Please enter a rating of 1-10 ");
		ft1.setFoodTruckRating(kb.nextInt());
	
		
	}

}
