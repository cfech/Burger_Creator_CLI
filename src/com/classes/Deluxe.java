package com.classes;

public class Deluxe extends Hamburger {

    private boolean wantDrink;
    private boolean wantChips;

    public Deluxe(String breadType, String meat, int lettuceCount, int tomatoCount, int cheeseCount, int pickleCount,
                  boolean wantDrink, boolean wantChips) {
        super(breadType, meat, lettuceCount, tomatoCount, cheeseCount, pickleCount);
        this.wantDrink = wantDrink;
        this.wantChips = wantChips;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        if(wantDrink){
            price += 2;
        }

        if(wantChips){
            price += 1;
        }

        return  price;
    }

    @Override
    public void getInfo() {
        System.out.println("Your Delux burger consists of: \n "
                + getBreadType() + " bread type\n "
                +  getMeat() +" meat \n "
                + getCheeseCount() + " piece(s) of cheese __ $" + getCheeseCount() * .5 + "\n "
                + getTomatoCount() + " piece(s) of tomato __ $"+ getTomatoCount() * .5 +"\n "
                + getLettuceCount() + " piece(s) of lettuce __ $" +getLettuceCount() * .5 + "\n "
                + getPickleCount() + " pickle(s) __ $ " + getPickleCount() * .25 + " \n ");
        if(wantChips){
            System.out.println("Chips __ $ 1");
        }

        if(wantDrink){
            System.out.println("Drink __ $2");
        }
        System.out.println("_________________________");
        System.out.println("Total Price  $" + getPrice());
    }

    public boolean isWantDrink() {
        return wantDrink;
    }

    public boolean isWantChips() {
        return wantChips;
    }
}

