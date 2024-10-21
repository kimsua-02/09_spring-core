package com.ohgiraffers.section01.common.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext();

        List<BookDTO> books = context.getBean("books", List.class);
        for (BookDTO book : books) {
            System.out.println(book);
        }
    }

}
