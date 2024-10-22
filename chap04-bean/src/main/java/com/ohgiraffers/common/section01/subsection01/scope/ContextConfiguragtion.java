package com.ohgiraffers.common.section01.subsection01.scope;


import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.ShoppingCart;
import com.ohgiraffers.common.product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguragtion {


    @Bean
    public product carpBread() {
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public product milk() {
        return new Beverage("딸기우유", 1500, 500);
    }

    @Bean
    public product water() {
        return new Beverage("지리산암반수", 1000, 500);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }

}
