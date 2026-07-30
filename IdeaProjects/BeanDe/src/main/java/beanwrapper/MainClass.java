package beanwrapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BeanWrapper bw = ctx.getBean(BeanWrapper.class);
        System.out.println(bw.ageMax);
        System.out.println(bw.fullName);
        //bw.display
    }
}
