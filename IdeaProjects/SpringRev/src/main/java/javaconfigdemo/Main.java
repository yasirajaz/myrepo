package javaconfigdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);

        //StudentInfo std1 = ctx.getBean(StudentInfo.class); //class name
        //StudentInfo std2=(StudentInfo)ctx.getBean("beanobj"); // bean name
        StudentInfo std3=(StudentInfo)ctx.getBean("beanobj1");
        std3.display();
        System.out.println("==================");
        StudentInfo std4=(StudentInfo)ctx.getBean("beanobj2");
        std4.display();
    }
}
