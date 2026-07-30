package mypkg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //singleton scope by default
        /*A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);
        b.getAge();
        a.setAge(50);
        b.getAge();*/
        //prototype scope
        A obj1=ctx.getBean(A.class);
        System.out.println("In between Instantiationv");
        B obj2=ctx.getBean(B.class);
        //A setAge se change kia h obj1 se,then jb usko get krenge obj1 se to wo set ki hui vlue milegi
        //but obj2 se get krenge to default value milgi kyuki obj2 me chnage nhi hua h
        obj1.beanDemo.setAge(50);
        System.out.println(obj1.beanDemo.getAge()+"     "+obj2.beanDemo.getAge());
    }
}
