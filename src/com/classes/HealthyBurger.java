package com.classes;

public class HealthyBurger extends Hamburger {
    private int tofuCount;
    private int avocadoCount;


    public HealthyBurger(String meat, int lettuceCount, int tomatoCount, int cheeseCount, int pickleCount,
                         int tofuCount, int avocadoCount) {
        super("Rye", meat, lettuceCount, tomatoCount, cheeseCount, pickleCount);
        this.tofuCount = tofuCount;
        this.avocadoCount = avocadoCount;
    }


    @Override
    public double getPrice() {
        double price = super.getPrice() + 1;
        price += tofuCount * 1;
        price += avocadoCount * .75;
        return price;
    }

    @Override
    public void getInfo() {
        System.out.println("Your Healthy Burger consists of: \n "
                + getBreadType() + " bread type\n "
                + getMeat() + " meat \n "
                + tofuCount + " tofu __ $" + tofuCount + " \n "
                + avocadoCount + " avocado __ $" + avocadoCount * .75 + " \n "
                + getCheeseCount() + " piece(s) of cheese __ $" + getCheeseCount() * .5 + "\n "
                + getTomatoCount() + " piece(s) of tomato __ $" + getTomatoCount() * .5 + "\n "
                + getLettuceCount() + " piece(s) of lettuce __ $" + getLettuceCount() * .5 + "\n "
                + getPickleCount() + " pickle(s) __ $ " + getPickleCount() * .25);
        System.out.println("----------------------");
        System.out.println("Total Price  $" + getPrice());

    }

    public int getTofuCount() {
        return tofuCount;
    }

    public int getAvocadoCount() {
        return avocadoCount;
    }
}
