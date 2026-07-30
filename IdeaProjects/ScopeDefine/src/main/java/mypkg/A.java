package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component
public class A {
    @Autowired
    BeanDemo beanDemo;
    A(){
        System.out.println("constructor of A");
    }

    /*public void setAge(int age) {
        beanDemo.setAge(age);
    }*/
}