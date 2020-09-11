package com.classes;

import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of burger would you like? \n Regular, Healthy, or Deluxe? ");
        String burgerType = scanner.nextLine();
        String burger = burgerType.toLowerCase();
//        if(burger != "regular" || burger != "healthy" || burger != "deluxe" ){
//            System.out.println("Invalid burger type");
//            scanner.close();
//        }

        System.out.println(burgerType);

        System.out.println("What type of bread would you like (not applicable if for healthy burger)");
        String breadType = scanner.nextLine();

        System.out.println("What type of meat would you like");
        String meatType = scanner.nextLine();

        System.out.println("How many piece(s) of lettuce would you like?");
        int lettuceCount = scanner.nextInt();

        System.out.println("How many pieces of tomato would you like?");
        int tomatoCount = scanner.nextInt();

        System.out.println("How many pieces of cheese would you like?");
        int cheeseCount = scanner.nextInt();

        System.out.println("How many pickles would you like?");
        int pickleCount = scanner.nextInt();


        switch (burger) {
            case "regular":
                Hamburger myBurger = new Hamburger(breadType, meatType, lettuceCount, tomatoCount, cheeseCount,
                        pickleCount);
                myBurger.getInfo();
                break;
            case "healthy":
                System.out.println("How many pieces of tofu would you like?");
                int tofuCount = scanner.nextInt();

                System.out.println("How much avocado would you like?");
                int avocadoCount = scanner.nextInt();
                HealthyBurger healthyBurger = new HealthyBurger(meatType, lettuceCount, tomatoCount, cheeseCount,
                        pickleCount, tofuCount, avocadoCount);

                healthyBurger.getInfo();
                break;
            case "deluxe":
                System.out.println("Do you want chips (true or false)");
                boolean wantChips = scanner.nextBoolean();

                System.out.println("Do you want a drink? (true or false)");
                boolean wantDrink = scanner.nextBoolean();

                System.out.println(wantChips + " " + wantDrink);
                Deluxe deluxe = new Deluxe(breadType, meatType, lettuceCount, tomatoCount, cheeseCount,
                        pickleCount,wantDrink,wantChips);
                deluxe.getInfo();
                break;
            default:

                System.out.println("Invalid Burger Type");
        }

        scanner.close();
    }
    
}
