package mypkg.pointcut;

import org.springframework.aop.ClassFilter;

public interface SimpleDynamicPointcutInterface {
    ClassFilter getFilter();
}
