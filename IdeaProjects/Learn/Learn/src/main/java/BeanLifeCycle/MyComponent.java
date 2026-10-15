package BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    int mem;
    public MyComponent(@Value("20") int mem){
        this.mem=mem;
    }
    @PostConstruct
    public void PostConst(){
        System.out.println("post contsruct method");
    }
    @PreDestroy
    public void PreDes(){
        System.out.print("Pre destroy method");

    }
    public void display(){
        System.out.println("member: "+mem);
    }
}
