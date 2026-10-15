package mypkg;
import org.aopalliance.intercept.*;
import org.jspecify.annotations.NonNull;
import org.slf4j.LoggerFactory;
import org.springframework.aop.*;
import org.springframework.util.StopWatch;
import java.lang.reflect.Method;
import org.slf4j.*;
public class Advices {

}
class SimpleBeforeAdvice implements MethodBeforeAdvice{
    private static Logger logger= LoggerFactory.getLogger(SimpleBeforeAdvice.class);
    @Override
    public void before(Method method,Object[] args,Object target)throws Throwable{
        logger.info("Before:set up concert hall");
    }
}
class SimpleAfterAdvice implements AfterReturningAdvice{
    private static Logger logger= LoggerFactory.getLogger(SimpleAfterAdvice.class);
    @Override
    public void afterReturning(Object returnValue, Method method,Object[] args, Object target)throws Throwable {
        logger.info("After: offer standing ovation");
    }
}
class SimpleAroundAdvice implements MethodInterceptor{
    private static Logger logger= LoggerFactory.getLogger(SimpleAroundAdvice.class);
    @Override
    public Object invoke(@NonNull MethodInvocation invocation)throws Throwable{
        logger.info("Around:starting timer");
        StopWatch sw=new StopWatch();
        sw.start(invocation.getMethod().getName());
        Object returnValue=invocation.proceed();
        sw.stop();
        logger.info("Around:concert durartion={}",sw.getTotalTimeMillis());
        return returnValue;
    }
}