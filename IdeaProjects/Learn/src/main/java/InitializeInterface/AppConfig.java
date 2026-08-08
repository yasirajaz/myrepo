package InitializeInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "InitializeInterface")
public class AppConfig {
   // @Bean(initMethod = "init")
    //public MyBean myBean() {
      //  return new MyBean();
    //}
}
