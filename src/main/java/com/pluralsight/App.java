package com.pluralsight;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("There are 2 sizes of sandwich available:\n\t1. Regular - $5.45\n\t2. Large - $7.45\nEnter the size of sandwich you want (1 or 2): ");
        int size = scanner.nextInt();
        if (size != 1 && size != 2) {
            System.out.println("Invalid size selected. Please select either 1 or 2.");
            scanner.close();
            return;
        }

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        double sandwichPrice = 0.0;
        if (size == 1) sandwichPrice = 5.45;
        else if (size == 2) sandwichPrice = 7.45;

        if (age <= 17) sandwichPrice *= 0.9;
        else if (age >= 65) sandwichPrice *= 0.8;
        
        System.out.printf("The price of your sandwich is: $%.2f\n", sandwichPrice);

        scanner.close();
    }
}
