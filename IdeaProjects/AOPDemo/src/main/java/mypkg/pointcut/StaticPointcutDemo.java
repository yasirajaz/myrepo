package mypkg.pointcut;
import org.aopalliance.aop.Advice;
import org.jspecify.annotations.NonNull;
import org.springframework.aop.*; //advisor class filter pointcut
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.*; //DefautPointcutAdvisor StaticMethodMatcherPointcut
import java.lang.reflect.Method;


class SimpleStaticPointcut extends NameMatchMethodPointcut{
    @Override
    public boolean matches(Method method,Class<?> cls){
        return ("sing".equals(method.getName()));
    }
    @Override
    @NonNull
    public ClassFilter getClassFilter(){
        return cls->(cls== GreatGuitarist.class);
    }
}

public class StaticPointcutDemo {
    public static void main(String... args){
        GoodGuitarist rdburmam=new GoodGuitarist();
        GreatGuitarist gorakhsharma=new GreatGuitarist();
        Singer proxyOne;
        Singer proxyTwo;
        Pointcut pc=new SimpleStaticPointcut();
        Advice advice=new SimpleAroundAdvice();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice); //aspect
        ProxyFactory pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(rdburmam);
        proxyOne=(Singer)pf.getProxy();
        pf=new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(gorakhsharma);
        proxyTwo=(Singer)pf.getProxy();
        proxyOne.sing();
        proxyTwo.sing();
    }
}