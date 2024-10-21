package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("section01/xmlconfig/spring-config.xml");

        MemberDTO member = (MemberDTO) context.getBean("member");

        // 입금
        System.out.println(member.getPersonalAccount().deposit(10000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // 출금
        System.out.println(member.getPersonalAccount().withDraw(5000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // 출금
        System.out.println(member.getPersonalAccount().withDraw(10000));
    }
}
