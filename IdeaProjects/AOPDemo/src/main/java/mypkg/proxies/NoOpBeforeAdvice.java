package mypkg.proxies;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

class NoOpBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

    }
}