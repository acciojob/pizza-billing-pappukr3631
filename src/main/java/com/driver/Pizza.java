package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping = 0;
    private int extraCheese = 0;
    private int takeaway = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            //price of veg pizza :300
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300";
        }else {
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese++;
        if(extraCheese == 1){
            this.bill += "\nExtra Cheese Added: 80";
            this.price += 80;
            extraCheese++;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        topping++;
        if(topping == 1) {
            topping++;
            if(isVeg){
                this.bill += "\nExtra Toppings Added: 70";
                this.price += 70;
            }else {
                this.bill += "\nExtra Toppings Added: 120";
                this.price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeaway++;
        if(takeaway == 1){
            takeaway++;
            this.bill += "\nPaperbag Added: 20";
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "\nTotal Price: " + this.price + "\n";
        return this.bill;
    }
}
