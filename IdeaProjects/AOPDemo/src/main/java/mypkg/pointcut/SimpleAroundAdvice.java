package mypkg.pointcut;

import org.aopalliance.intercept.*;
import org.slf4j.*;

import java.util.Locale;

public class SimpleAroundAdvice implements MethodInterceptor{
    public static Logger logger= LoggerFactory.getLogger(GreatGuitarist.class);
    @Override
    public Object invoke(MethodInvocation invocation)throws Throwable{
        logger.info(">>Invoking method "+invocation.getMethod().getName().toUpperCase());
        Object returnValue=invocation.proceed();
        logger.info(">>Advise Done on method "+invocation.getMethod().getName().toUpperCase());
        return returnValue;
    }
}
