package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping = 0;
    private int extraCheese = 0;
    private int takeaway = 0;
    private int billingDone = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            //price of veg pizza :300
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        }else {
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese++;
        if(extraCheese == 1) {
            this.price += 80;
            extraCheese++;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        topping++;
        if(topping == 1) {
            if (isVeg)
                this.price += 70;
            else
                this.price += 120;
            topping++;
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeaway++;
        if(takeaway == 1) {
            this.price += 20;
            takeaway++;
        }
    }

    public String getBill(){
        // your code goes here
        if(billingDone == 0) {
            billingDone++;
            //1. Extra Cheese
            if (extraCheese > 0) {
                this.bill += "Extra Cheese Added: 80\n";
                extraCheese++;
            }
            //2. ExtraToppings
            if (topping > 0) {
                topping++;
                if (isVeg) {
                    this.bill += "Extra Toppings Added: 70\n";
                } else {
                    this.bill += "Extra Toppings Added: 120\n";
                }
            }
            //3. PaperBag
            if (takeaway > 0) {
                takeaway++;
                this.bill += "Paperbag Added: 20\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            return this.bill;
        }
        else
            return "Total Price: " + this.price + "\n";
    }
}
