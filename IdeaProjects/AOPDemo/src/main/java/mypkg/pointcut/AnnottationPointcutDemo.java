package mypkg.pointcut;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

public class AnnottationPointcutDemo {
    public static void main(String[] args) {
        var johnthedon = new AnnotatedGuitarist();
        var pc = AnnotationMatchingPointcut.forMethodAnnotation(AdviceRequired.class);

        var advisor = new DefaultPointcutAdvisor(pc, new SimpleAroundAdvice());
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnthedon);
        pf.addAdvisor(advisor);
        AnnotatedGuitarist proxy = (AnnotatedGuitarist) pf.getProxy();
        proxy.sing(new Guitar());
        proxy.rest();

    }
}

