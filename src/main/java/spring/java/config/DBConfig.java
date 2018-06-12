package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.domain.DataSource;
@Configuration
public class DBConfig {

    @Bean
    DataSource dataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setUrl("data.com");
        dataSource.setUserName("admin");
        dataSource.setPassword("qwerty");
        return dataSource;
    }
}
