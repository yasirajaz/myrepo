package component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainClass {
    int mem;
    public MainClass(@Value("20")int mem){
        this.mem=mem;
    }
    public void display(){
        System.out.println("display mem: "+ mem);
    }
    public static void main(String... args){
        var ctx=new AnnotationConfigApplicationContext();
        ctx.register(MainClass.class);
        ctx.refresh();
        var m=ctx.getBean(MainClass.class);
        m.display();
    }

}
