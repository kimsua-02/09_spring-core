package com.ohgiraffers.common.section04.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.product;
import com.ohgiraffers.common.ShoppingCart;
import com.ohgiraffers.common.section01.subsection01.scope.ContextConfiguragtion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguragtion.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames){
            System.out.println("bean = " + bean);
        }

        product carpBread = context.getBean("carpBread", Bread.class);
        product milk = context.getBean("milk", Beverage.class);
        product water = context.getBean("water", Beverage.class);

        // 첫번째 손님이 쇼핑 카르를 꺼낸다.
        ShoppingCart cart = context.getBean("cart", ShoppingCart.class);
        cart.addItem(carpBread);
        cart.addItem(milk);
        System.out.println("cart 에 담긴 물품 : " + cart.getItems());

        // 두 번 째 손님이 카트를 꺼낸다.
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("cart2 에 담긴 물품 : " + cart2.getItems());

        System.out.println("cart = " + cart.hashCode());
        System.out.println("cart2 = " + cart2.hashCode());

    }

}