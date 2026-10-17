package DependencyInjection.constDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student st=ctx.getBean(Student.class);
        st.display();
    }
}
