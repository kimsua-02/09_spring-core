package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.Map;

@Repository
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;
}
