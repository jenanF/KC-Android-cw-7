package com.example.mycw7;

public class items {

    private String itemName;
    private int itemImage;
    private double itemPrice;

    public items ( String itemName, int itemImage, double itemPrice){

        this.itemName= itemName;
        this.itemImage=itemImage;
        this.itemPrice=itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
