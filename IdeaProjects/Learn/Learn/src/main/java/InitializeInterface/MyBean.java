package InitializeInterface;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("yasir")
public class MyBean implements InitializingBean, DisposableBean , BeanNameAware {
    private String name;
    @Override
    public void setBeanName(String name){
        this.name=name;
        System.out.println(name);
    }
    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("afterPropertiesSet() method called");
    }
    @PostConstruct
    public void show(){
        System.out.println("show method");
    }
    public void init(){
        System.out.println("intit method called");
    }
    public void display(){
        System.out.println("display method");
    }
    @Override
    public void destroy() throws Exception{
        System.out.println("Destroy method");
    }

}
