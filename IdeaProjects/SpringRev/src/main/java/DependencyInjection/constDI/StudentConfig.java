package DependencyInjection.constDI;


import org.springframework.context.annotation.Bean;

public class StudentConfig {
    @Bean
    public Address createAdd(){
        Address add=new Address(101,"Lucknow",12345);

        return add;
    }
   @Bean
    public Student stdobj(){
        Student st=new Student("yasir",23,createAdd());
        return st;
   }

}
