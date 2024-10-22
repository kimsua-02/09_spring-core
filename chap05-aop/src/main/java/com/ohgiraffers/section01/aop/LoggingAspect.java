package com.ohgiraffers.section01.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class LoggingAspect {

    /*
    * 필기 나중에 깃허브 보고 적으셈.
    * */

    /*
    * 포인트 컷 필기 나중에 깃허브 보고 적으셈.
    * */

    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void logPointCut() {
        System.out.println("늬 증말 실행 아이되니 ?");
    }

    @Before("LoggingAspect.logPointCut()")
    public void logBefore(JoinPoint joinPoint) {
        // 현재 실행중인 타깃 객체를 반환
        System.out.println("before joinpoint.getTarget() : " + joinPoint.getTarget());

        // 호출된 메소드의 시그니처 반환
        // 시그니처 : 반환 타입, 경로, 매개변수 타입
        System.out.println("before joinPoint.getSignature() : " + joinPoint.getSignature());

        if (joinPoint.getArgs().length > 0) {
            System.out.println("before joinpoint.getArgs()[] : " + joinPoint.getArgs()[0]);
        }
    }

    @After("logPointCut()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("after joinpoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("after joinpoint.getSignature() : " + joinPoint.getSignature());
    }

    // aop 가 적용될 메소드가 에러 없이 정상적으로 실행된 이후 실행
    @AfterReturning(pointcut = "logPointCut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning result : " + result);
//        if(result != null && result instanceof Map) {
//            ((Map<Integer, MemberDTO>)result).put(100, new MemberDTO(100, "가공한 값"));
//        }
    }

    @AfterThrowing(pointcut = "logPointCut()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println("After Throwing exception : " + exception);
    }

    /*
    * Around Advice 는 가장 강력한 어드바이스이다.
    * 이 어드바이스는 조인포인트를 완전히 장악한다.
    * 따라서 앞에 살펴본 어드바이스 모두 어라운드 어드바이스로 조합할 수 있다.
    * 매개변수는 ProceedingJoinPoint 로 고정되어 있다.
    * 조인포인트 의 하위 인터페이스로 원본 조인포인트의 진행 시점을 제어할 수 있다.
    * */

    @Around("logPointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 메소드 실행 전 로그 출력
        System.out.println("Around Before : " + joinPoint.getSignature().getName());

        // 원본 메소드 실행
        Object result = joinPoint.proceed();
        if (result != null && result instanceof Map) {
            ((Map<Integer,MemberDTO>)result).put(100, new MemberDTO(100, "반환 값 가공"));
        }

        // 메소드 실행 후 로그 출력
        System.out.println("Around After : " + joinPoint.getSignature().getName());

        // 결과 반환
        return result;
    }

}
