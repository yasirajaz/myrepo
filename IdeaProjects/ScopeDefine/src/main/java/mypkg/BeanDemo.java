package mypkg;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanDemo {
    private int age = 20;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
