package com.alisnooba.shoppingcart;

public class CartItem {
    private int itemID;
    private double price;
    private int quantity;
    private String itemName;

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public CartItem(int itemID, double price, String itemName, int quantity) {
        this.itemID = itemID;
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
    }

}

