package cn.douma.woyo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-31
 * Time: 17:11
 */
@SuppressWarnings("ALL")
@Component
@Aspect
public class ControllerAoper {

    @Pointcut(value = "execution(* cn.douma.woyo.controller.*.*(..))")
    public void pointCut() {

    }
//
//    @Before(value = "pointCut()")
//    public void before(JoinPoint joinPoint) {
//        System.out.println(">>>>>Before");
//    }
//
//    @Around(value = "pointCut()")
//    public void around(ProceedingJoinPoint pjp) throws  Throwable{
//        System.out.println(">>>>>Around-from");
//        try {
//            pjp.proceed();
//        } catch (Exception e) {
//            System.out.println(">>>>>exception " + e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println(">>>>>Around-to");
//    }
//
//    @AfterReturning(value = "pointCut()")
//    public void afterReturning(JoinPoint joinPoint) {
//        System.out.println(">>>>>AfterReturning");
//    }
//
//    @AfterThrowing(value = "pointCut()")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println(">>>>>AfterThrowing");
//    }
//
//    @After(value = "pointCut()")
//    public void after(JoinPoint joinPoint) {
//        System.out.println(">>>>>After");
//    }

}
