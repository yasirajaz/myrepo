package DependencyInjection.setterDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class StudentConfig {
    @Bean
    public  Address createAdd(){
        Address add=new Address();
        add.setHouseno(101);
        add.setCity("Lucknow");
        add.setPincode(12345);
        return add;
    }
    @Bean
    public Student stdobj(){
        Student std=new Student();
        std.setName("yasir");
        std.setAge(23);
        std.setAddress(createAdd());
        return std;
    }

}
