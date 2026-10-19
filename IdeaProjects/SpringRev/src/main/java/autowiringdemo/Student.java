package autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {
    private String name;
    private int age;
    @Autowired
    private Address address;
    @Autowired
    private Subjects subjects;

    public Student(String name,int age,Address address,Subjects subjects){
        this.name=name;
        this.age=age;
        this.address=address;
        this.subjects=subjects;
    }


    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Subjects: "+subjects);
    }
}
