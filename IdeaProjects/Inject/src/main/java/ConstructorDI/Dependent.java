package ConstructorDI;
import org.springframework.stereotype.Component;

@Component("dependent")
public class Dependent {
    public void myMethod(){
        System.out.println("this is my method");
    }
}
