package InitTest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(initMethod = "init")
    MyClass bean1() {
        MyClass m = new MyClass();
        m.setName("Ajay Kumar ");
        m.setAge(30);
        return m;
    }

    @Bean(initMethod = "init")
    MyClass bean2() {
        MyClass m = new MyClass();
        m.setName("Dheeraj");
        return m;
    }

    @Bean(initMethod = "init")
    MyClass bean3() {
        MyClass m = new MyClass();
        m.setAge(25);
        return m;
    }
}