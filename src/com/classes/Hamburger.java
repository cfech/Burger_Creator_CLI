package com.classes;

public class Hamburger {
    private String breadType;
    private String meat;
    private int lettuceCount;
    private int tomatoCount;
    private int cheeseCount;
    private int pickleCount;
    private double price;

    public Hamburger(String breadType, String meat, int lettuceCount, int tomatoCount, int cheeseCount,
                     int pickleCount) {
        this.breadType = breadType;
        this.meat = meat;
        this.lettuceCount = lettuceCount;
        this.tomatoCount = tomatoCount;
        this.cheeseCount = cheeseCount;
        this.pickleCount = pickleCount;
        this.price = 4;
    }

    public double getPrice() {
        this.price += lettuceCount * .5;
        this.price += tomatoCount * .5;
        this.price += cheeseCount * .5;
        this.price += pickleCount * .25;
        return this.price;
    }

    public void getInfo() {
        System.out.println("Your Hamburger consists of: \n "
                + getBreadType() + " bread type\n "
                + getMeat() + " meat \n "
                + getCheeseCount() + " piece(s) of cheese __ $" + getCheeseCount() * .5 + "\n "
                + getTomatoCount() + " piece(s) of tomato __ $" + getTomatoCount() * .5 + "\n "
                + getLettuceCount() + " piece(s) of lettuce __ $" + getLettuceCount() * .5 + "\n "
                + getPickleCount() + " pickle(s) __ $ " + getPickleCount() * .25);

        System.out.println("------------------------");
        System.out.println("Total Price  $" + getPrice());
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public int getLettuceCount() {
        return lettuceCount;
    }

    public int getTomatoCount() {
        return tomatoCount;
    }

    public int getCheeseCount() {
        return cheeseCount;
    }

    public int getPickleCount() {
        return pickleCount;
    }

    public double getInitialPrice() {
        return price;
    }
}
