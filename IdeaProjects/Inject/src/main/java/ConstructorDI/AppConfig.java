package ConstructorDI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "ConstructorDI")
public class AppConfig{}
/*public class AppConfig {
    @Bean;
    public Dependent dependent() {
        return new Dependent();
    }
    @Bean
    public Dependency dependency() {
        Dependency dependency = new Dependency();
        dependency.setDep(dependent());
        return dependency;
    }
}*/
