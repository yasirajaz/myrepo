package beanwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanwrapp")
public class BeanWrapper {
    @Value("#{beandemo.age2}")
    int ageMax;
    @Value("#{beandemo.name2.toUpperCase()}")
    String fullName;
    private BeanDemo bd;

    @Autowired
    public BeanWrapper(BeanDemo bd) {
        this.bd = bd;
    }

   /* public void display() {
        String y=bd.name;
        int x=bd.age;
        float z=bd.salary;
        System.out.println(y+"   "+x+"   "+z);
    }*/
}