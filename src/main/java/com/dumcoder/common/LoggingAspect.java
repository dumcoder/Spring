package com.dumcoder.common;

import com.dumcoder.core.HelloWorld;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

    @Before("execution(public * *(..))")
    public void logBefore(JoinPoint joinPoint){
        final Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass().getName());

        StringBuilder startMessageStringBuffer = new StringBuilder();

        startMessageStringBuffer.append("Start method ");
        startMessageStringBuffer.append(joinPoint.getSignature().getName());
        startMessageStringBuffer.append("(");

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            startMessageStringBuffer.append(arg).append(",");
        }
        if (args.length > 0) {
            startMessageStringBuffer.deleteCharAt(startMessageStringBuffer.length() - 1);
        }

        startMessageStringBuffer.append(")");

        logger.trace(startMessageStringBuffer.toString());
    }

    @AfterReturning(pointcut = "execution(public * *(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        final Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass().getName());

        StringBuffer startMessageStringBuffer = new StringBuffer();

        startMessageStringBuffer.append("End method ");
        startMessageStringBuffer.append(joinPoint.getSignature().getName());
        startMessageStringBuffer.append("(");

        startMessageStringBuffer.append(result);
        startMessageStringBuffer.append(")");

        logger.trace(startMessageStringBuffer.toString());
    }
}
