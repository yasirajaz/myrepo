package mypkg.pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
public class NameMatchMethodAdvisorDemo {
    public static void main(String[] args) {
        GrammyGuitarist johncena=new GrammyGuitarist();
        NameMatchMethodPointcutAdvisor advisor=new NameMatchMethodPointcutAdvisor(new SimpleAroundAdvice());
        // no need to add every method in advisor manually
        advisor.setMappedNames("sing","rest");
        ProxyFactory pf=new ProxyFactory();
        pf.setTarget(johncena);
        pf.addAdvisor(advisor);
        GrammyGuitarist proxy=(GrammyGuitarist) pf.getProxy();
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
        proxy.talk();
    }
}
