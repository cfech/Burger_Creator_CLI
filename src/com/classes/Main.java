package com.classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        initBurger();
    }

    public static void initBurger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of burger would you like? \n Regular, Healthy, or Deluxe? ");
        String burgerType = scanner.nextLine();
        String burger = burgerType.toLowerCase();

        if (burger.equals("regular") || burger.equals("deluxe") || burger.equals("healthy")) {

            switch (burger) {
                case "regular":
                    createRegularBurger();
                case "healthy":
                    createHealthyBurger();
                case "deluxe":
                    createDeluxeBurger();
            }
        } else {
            System.out.println("invalid burger");
            initBurger();
        }

    }

    public static void createAnotherBurger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Would you like to create another burger?");
        boolean makeAnother = scanner.nextBoolean();
        System.out.println(makeAnother);

        if (makeAnother) {
            initBurger();
        } else {
            System.out.println("Thank you, goodbye");
            scanner.close();
        }
    }

    public static void createRegularBurger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of bread would you like");
        String breadType = scanner.nextLine();

        System.out.println("What type of meat would you like");
        String meatType = scanner.nextLine();

        System.out.println("How many piece(s) of lettuce would you like?");
        int lettuceCount = scanner.nextInt();

        System.out.println("How many piece(s) of tomato would you like?");
        int tomatoCount = scanner.nextInt();

        System.out.println("How many piece(s) of cheese would you like?");
        int cheeseCount = scanner.nextInt();

        System.out.println("How many pickle(s) would you like?");
        int pickleCount = scanner.nextInt();

        Hamburger myBurger = new Hamburger(breadType, meatType, lettuceCount, tomatoCount, cheeseCount,
                pickleCount);
        myBurger.getInfo();

        createAnotherBurger();
    }

    public static void createHealthyBurger() {
        System.out.println("--Comes with Rye roll--");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of meat would you like");
        String meatType = scanner.nextLine();

        System.out.println("How many piece(s) of lettuce would you like?");
        int lettuceCount = scanner.nextInt();

        System.out.println("How many piece(s) of tomato would you like?");
        int tomatoCount = scanner.nextInt();

        System.out.println("How many piece(s) of cheese would you like?");
        int cheeseCount = scanner.nextInt();

        System.out.println("How many pickle(s) would you like?");
        int pickleCount = scanner.nextInt();

        System.out.println("How many pieces of tofu would you like?");
        int tofuCount = scanner.nextInt();

        System.out.println("How much avocado would you like?");
        int avocadoCount = scanner.nextInt();
        HealthyBurger healthyBurger = new HealthyBurger(meatType, lettuceCount, tomatoCount, cheeseCount,
                pickleCount, tofuCount, avocadoCount);

        healthyBurger.getInfo();
        createAnotherBurger();
    }

    public static void createDeluxeBurger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of bread would you like");
        String breadType = scanner.nextLine();

        System.out.println("What type of meat would you like");
        String meatType = scanner.nextLine();

        System.out.println("How many piece(s) of lettuce would you like?");
        int lettuceCount = scanner.nextInt();

        System.out.println("How many piece(s) of tomato would you like?");
        int tomatoCount = scanner.nextInt();

        System.out.println("How many piece(s) of cheese would you like?");
        int cheeseCount = scanner.nextInt();

        System.out.println("How many pickle(s) would you like?");
        int pickleCount = scanner.nextInt();

        System.out.println("Do you want chips (true or false)");
        boolean wantChips = scanner.nextBoolean();

        System.out.println("Do you want a drink? (true or false)");
        boolean wantDrink = scanner.nextBoolean();

        System.out.println(wantChips + " " + wantDrink);
        Deluxe deluxe = new Deluxe(breadType, meatType, lettuceCount, tomatoCount, cheeseCount,
                pickleCount, wantDrink, wantChips);
        deluxe.getInfo();
        createAnotherBurger();
    }
}
