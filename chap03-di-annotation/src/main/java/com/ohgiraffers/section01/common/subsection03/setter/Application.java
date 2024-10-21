package com.ohgiraffers.section01.common.subsection03.setter;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext();

        List<BookDTO> books = context.getBean("books", List.class);
        System.out.println("book");
    }

}
