package com.alisnooba.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ShoppingCart {
    private List<CartItem> cartItemList = new ArrayList<>();

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void addItem(CartItem cartItem) {
        this.cartItemList.add(cartItem);
    }

    public boolean hasItem(CartItem cartItem) {

        return cartItemList.contains((cartItem));
    }

    public boolean isEmpty() {
        return true;
    }

    public double finalSubtotal() {
     double cartTotal =0;
        for (CartItem cartItem :cartItemList ) {
            cartTotal= cartTotal + cartItem.getPrice();
        }
        return cartTotal;
    }

    public int quantityUpdate() {

        return cartItemList.get(0).getQuantity();
    }

    public int multipleSameItemQuantityUpdate() {

     int multipleSameItemQuantity =0;
        for (CartItem cartItem :cartItemList ) {
           multipleSameItemQuantity = multipleSameItemQuantity + cartItem.getQuantity();
        }
        return multipleSameItemQuantity;
    }
}

