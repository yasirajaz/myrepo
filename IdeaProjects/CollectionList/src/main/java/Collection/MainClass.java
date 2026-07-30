package Collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CollectionDemoBean bw = ctx.getBean(CollectionDemoBean.class);
        bw.display();
    }
}
