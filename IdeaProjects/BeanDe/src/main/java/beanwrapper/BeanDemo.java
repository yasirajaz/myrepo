package beanwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beandemo")
public class BeanDemo {

    /*int age;
    @Autowired
    BeanDemo(@Value("23")int age){
        this.age=age;
    }
    public BeanDemo() {
        age=23;
    }*/
    /*@Value("23")
    int age;
    @Value("Yasir Ajaz")
    String name;
    @Value("10.5")
    float salary;
    BeanDemo(){}*/

    private int age=23;
    private String name="Yasir Ajaz";
    public int getAge2(){
        return age;
    }
    public String getName2(){
        return name;
    }
    BeanDemo(){}
}

