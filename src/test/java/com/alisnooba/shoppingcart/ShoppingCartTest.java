package com.alisnooba.shoppingcart;

//import com.sun.deploy.net.MessageHeader;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartTest {
    ShoppingCart shoppingCart = new ShoppingCart();
    private CartItem List;

     @Test
    public void cartEmpty(){
        assertTrue(shoppingCart.isEmpty());
    }
    @Test
        public void addItem() {

        ShoppingCart shoppingCart = new ShoppingCart();
        CartItem cartItem = new CartItem(1,9.99,"itemA",1);
        shoppingCart.addItem(cartItem);
        assertTrue(shoppingCart.hasItem(cartItem));
        //assertEquals(9.99,shoppingCart.finalSubtotal(cartItem),0);
        assertEquals(cartItem.getPrice(),shoppingCart.finalSubtotal(),0.0001);

    }
    @Test
    public void addMultipleItems(){
        ShoppingCart shoppingCart = new ShoppingCart();

       CartItem cartItem1 = new CartItem(1,9.99,"itemA",1);
       CartItem cartItem2 = new CartItem(2,10.99,"itemB",2);

        shoppingCart.addItem(cartItem1);
        shoppingCart.addItem(cartItem2);
        double expected = cartItem1.getPrice() + cartItem2.getPrice();
        //assertTrue(shoppingCart.hasItem(CartItem));
        //assertEquals(9.99,shoppingCart.finalSubtotal(cartItem),0);
        assertEquals(expected,shoppingCart.finalSubtotal(),0.0001);
    }

    @Test
    public void quantityUpdate(){

        ShoppingCart shoppingCart = new ShoppingCart();
        CartItem cartItem = new CartItem(1,9.99,"itemA",1);
        shoppingCart.addItem(cartItem);
        assertEquals(cartItem.getQuantity(),shoppingCart.quantityUpdate());

    }
    @Test
    public void multipleSameItemQuantityUpdate(){

        ShoppingCart shoppingCart = new ShoppingCart();
        CartItem cartItem = new CartItem(1,9.99,"itemA",1);
        CartItem cartItem2 = new CartItem(2,10.99,"itemB",2);
        shoppingCart.addItem(cartItem);
        shoppingCart.addItem(cartItem2);
        shoppingCart.addItem(cartItem2);
        assertEquals(4,shoppingCart.multipleSameItemQuantityUpdate());

    }


}

