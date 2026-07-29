package com.burkina.aop;

import jakarta.persistence.Entity;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.hibernate.proxy.HibernateProxy;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
public class BaseLoggingAspect {

    protected void logBefore(JoinPoint joinPoint) {
        String methodName = getMethodName(joinPoint);
        String className = getClassName(joinPoint);
        Object[] args = joinPoint.getArgs();

        log.info("▶ {}.{}() called with args: {}", className, methodName, argsToString(args));
    }

    protected void logAfterReturning(JoinPoint joinPoint, Object result) {
        String methodName = getMethodName(joinPoint);
        String className = getClassName(joinPoint);

        log.info("✅ {}.{}() returned: {}", className, methodName, resultToString(result));
    }

    protected void logAfterTrowing(JoinPoint joinPoint, Exception exception) {
        String methodName = getMethodName(joinPoint);
        String className = getClassName(joinPoint);

        log.warn("❌ {}.{}() threw exception: {} - {}",
                className, methodName, exception.getClass(), exception.getMessage());
    }

    private String argsToString(Object[] args) {
        if (args == null || args.length == 0) return "[]";

        return Stream.of(args)
                .map(arg -> {
                    if (arg == null) return "null";
                    if (arg instanceof String) return "\"" + arg + "\"";

                    if (arg instanceof HibernateProxy proxy) {
                        return proxy.getHibernateLazyInitializer()
                                .getPersistentClass()
                                .getSimpleName();
                    }

                    if (arg.getClass().isAnnotationPresent(Entity.class)) {
                        return arg.getClass().getSimpleName();
                    }

                    return arg.toString();
                })
                .collect(Collectors.joining(", ", "[", "]"));
    }

    private String resultToString(Object result) {
        if (result == null) return "null";

        if (result instanceof Collection<?> collection) {
            return String.format("Collection[size=%d]", collection.size());
        }

        String str = result.toString();
        if (str.length() > 100) {
            return str.substring(0, 100) + "...";
        }

        return str;
    }

    private String getMethodName(JoinPoint joinPoint) {
        return joinPoint.getSignature().getName();
    }

    private String getClassName(JoinPoint joinPoint) {
        return joinPoint.getTarget().getClass().getSimpleName();
    }
}
