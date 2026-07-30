package AlgosW;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainClass{
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        AlgosWrapper aw = ctx.getBean(AlgosWrapper.class);
        int[] arr = {5, 2, 8, 1, 3};
        aw.caller(arr);
    }
}