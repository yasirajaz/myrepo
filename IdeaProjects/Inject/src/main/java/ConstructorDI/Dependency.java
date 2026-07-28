package ConstructorDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dependency")
public class Dependency {
    @Autowired //this sis called field inejection
    Dependent dep;
    public Dependency(){}
         /*   public Dependency(Dependent dep){
        this.dep=dep;
    }*/
    /*public void setDep(Dependent dep){
        this.dep=dep;
    }*/
    /*Dependency(Dependent d) {
        this.d = d;
    }*/
    void demoMethod(){
        System.out.println("this is demo method");
        dep.myMethod();
        System.out.println("end of demo method");
    }
}