package javaconfigdemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean("beanobj1")
    public StudentInfo stdid(){
        StudentInfo st=new StudentInfo();
        st.setName("yasir");
        st.setAge(23);
        return st;
    }
    @Bean("beanobj2")
    public StudentInfo stdid2(){
        StudentInfo st=new StudentInfo();
        st.setName("amir");
        st.setAge(21);
        return st;
    }
    //
}
