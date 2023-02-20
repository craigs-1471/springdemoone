package coms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "coms")
public class BeanConfig {

//    @Bean
//    @Scope(scopeName = "prototype")
    public Doctor doctor() {
        return new Doctor();
    }
}
