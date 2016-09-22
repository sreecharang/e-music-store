package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by charan on 1/25/2016.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
