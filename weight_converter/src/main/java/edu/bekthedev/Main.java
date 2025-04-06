package edu.bekthedev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Weitght Converstion Program

        //Declare variables
        Scanner scanner =  new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;


        //welcome message
        System.out.println("Weight Converstion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        
         //prompt for user choice
        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        //option 1 convert lbs to kgs or option 2 convert kgs to lbs else print not a valid choice

        if(choice == 1) {
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);

        } else if(choice == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        } else {
            System.out.println("Not a valid choice");
        } 






        scanner.close();
    }
}