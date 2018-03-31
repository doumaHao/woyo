package cn.douma.woyo.aop;

import org.aspectj.lang.JoinPoint;
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

    /**
     * 执行方法前
     *
     * @param jp 连接点
     */
    @Before("pointCut()")
    public void Before(JoinPoint jp) {
        System.out.println(">>>>>Before");
    }

    /**
     * 返回后
     *
     * @param jp
     * @param result
     */
    @AfterReturning(value = "pointCut()", returning = "result")
    public void AfterReturning(JoinPoint jp, Object result) {
        System.out.println(">>>>>AfterReturning");
    }

    /**
     * 抛出后
     *
     * @param jp
     */
    @AfterThrowing(value = "pointCut()")
    public void AfterThrowing(Throwable ex) {
        System.out.println(">>>>>AfterThrowing");
    }

}
