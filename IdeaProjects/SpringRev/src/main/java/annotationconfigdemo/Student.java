package annotationconfigdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student{
    @Value("yasir")
    private String name;
    @Value("23")
    private int age;
    @Value("93.4f")
    private float marks;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }
}
