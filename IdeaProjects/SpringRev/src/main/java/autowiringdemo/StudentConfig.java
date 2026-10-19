package autowiringdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    public Address createAddobj1(){
        return new Address(101,"Lucknow",12345);
    }
    @Bean
    //@Primary lgane se ye bean default ho jaegi
    @Primary
    public Address createAddobj2(){
        return new Address(102,"Aligarh",202002);
    }
    @Bean
    public Subjects createSubobj(){
        Subjects s=new Subjects();
        List<String> sub=new ArrayList<>();
        sub.add("Python");
        sub.add("Java");
        sub.add("C");
        sub.add("C++");
        s.setSubjects(sub);
        return s;
    }
    @Bean
   // public Student createstdobj(@Qualifier("createAddobj1") Address address){ aise krne ke liye @Autowired hatana pdega
    public Student createstdobj( Address address,Subjects subjects){
        return new Student("yasir",23,address,subjects);
    }
}
