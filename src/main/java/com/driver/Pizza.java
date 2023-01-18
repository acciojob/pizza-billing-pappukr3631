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
            this.price = 300;
        }else {
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.extraCheese++;
        if(this.extraCheese == 1)
            this.price += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.topping++;
        if(this.topping == 1) {
            if (this.isVeg)
                this.price += 70;
            else
                this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.takeaway++;
        if(this.takeaway == 1)
            this.price += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill = "";
        //1. Pizza Base
        if(isVeg){
            this.bill = "Base Price Of The Pizza: 300\n";
        }else {
            this.bill = "Base Price Of The Pizza: 400\n";
        }
        //2. Extra Cheese
        if(this.extraCheese > 0) {
            this.bill += "Extra Cheese Added: 80\n";
        }
        //3. ExtraToppings
        if(this.topping > 0) {
            if (this.isVeg) {
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.bill += "Extra Toppings Added: 120\n";
            }
        }
        //4. PaperBag
        if (this.takeaway > 0) {
            this.bill += "Paperbag Added: 20\n";
        }
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
