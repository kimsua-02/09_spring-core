package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public List<product> getItems() {
        return items;
    }

    public void addItem(product item) {
        items.add(item);
    }

}
