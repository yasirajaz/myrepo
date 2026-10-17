package DependencyInjection.setterDI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
    private String name;
    private int age;
    private Address address;


    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}
