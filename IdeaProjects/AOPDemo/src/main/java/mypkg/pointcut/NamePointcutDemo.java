package mypkg.pointcut;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class NamePointcutDemo {
    public static void main(String[] args) {
        GrammyGuitarist john=new GrammyGuitarist();
        NameMatchMethodPointcut pc=new NameMatchMethodPointcut();
        //manually adding method by name
        pc.addMethodName("sing");
        pc.addMethodName("rest");
        Advisor advisor=new DefaultPointcutAdvisor(pc,new SimpleAroundAdvice());
        ProxyFactory pf=new ProxyFactory();
        pf.setTarget(john);
        pf.addAdvisor(advisor);
        GrammyGuitarist proxy=(GrammyGuitarist) pf.getProxy();
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
        proxy.talk();
    }
}
