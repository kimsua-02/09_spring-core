package com.ohgiraffers.common;

public abstract class product {

    private String name; // 상품 명
    private int price; // 가격

    public product() {
    }

    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
