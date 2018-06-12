package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;
@Configuration
@ComponentScan(basePackages = {"spring.java"})
public class JavaConfig {
     @Bean(name = "blogPost")
     public BlogPostService blogPostService(){
         return new BlogPostServiceImpl();
     }
}
