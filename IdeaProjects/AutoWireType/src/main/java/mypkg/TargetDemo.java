package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("targetdemo")
public class TargetDemo {
    //by name using Qualifier
    //public void setComponent(@Qualifier("autodemo") AutoDemo ad){
    //ByType AutoDemo ad
    /*public void setComponent(AutoDemo ad){
        this.ad=ad;
    }*/
            //constructor type
    AutoDemo ad;
   @Autowired
    public TargetDemo(AutoDemo ad){
        this.ad=ad;
        System.out.println("const with arg");
    }
    @Autowired
    public void setAutoDemo(AutoDemo ad){
        this.ad=ad;
        System.out.println("setter");
    }
    //if no auto wired is used in multiple cons then it will take default cons i.e cons with no arg
    /*public TargetDemo(){
        ad=null;
        System.out.println("cons with no arg");
    }*/
}
