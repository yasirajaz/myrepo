package mypkg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class B {
    @Autowired
    BeanDemo beanDemo;
    B(){
        System.out.println("Constructor of B");
    }


    /*
    public void getAge() {
        System.out.println(beanDemo.getAge());
    }*/
}
