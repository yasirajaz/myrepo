package InitializeInterface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        MyBean bean = context.getBean(MyBean.class);
        bean.display();
      context.registerShutdownHook();  context.close();
    }
}
