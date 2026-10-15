package BeanLifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainClass {
    public static void main(String... args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyComponent.class);
        ctx.refresh();
        var m=ctx.getBean(MyComponent.class);
        m.display();
        ctx.close();
    }
}
