package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Applicaiton {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean : beanNames) {
            System.out.println("bean = " + bean);
        }

        PokemonService pokemonService = context.getBean("pokemonservicePrimary", PokemonService.class);

        pokemonService.pokemonAttack();

    }
}
