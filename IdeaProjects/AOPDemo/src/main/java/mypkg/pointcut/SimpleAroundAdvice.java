package mypkg.pointcut;

import org.aopalliance.intercept.*;
import org.slf4j.*;

public class SimpleAroundAdvice implements MethodInterceptor{
    public static Logger logger= LoggerFactory.getLogger(GreatGuitarist.class);
    @Override
    public Object invoke(MethodInvocation invocation)throws Throwable{
        logger.info(">>Invoking "+invocation.getMethod().getName());
        Object returnValue=invocation.proceed();
        logger.info(">>Done");
        return returnValue;
    }
}
