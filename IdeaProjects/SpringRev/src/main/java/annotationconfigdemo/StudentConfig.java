package annotationconfigdemo;
import javaconfigdemo.StudentInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotationconfigdemo")
public class StudentConfig {
}
