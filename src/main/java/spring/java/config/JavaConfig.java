package spring.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring.config.ServiceConfig;
import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;
import spring.java.service.impl.MediumBlogPostServiceImpl;
import spring.java.service.impl.WordPressBlogPostServiceImpl;

@Configuration
@ComponentScan(basePackages = {"spring.java"})
@Import(value = {ServiceConfig.class})
public class JavaConfig {
    @Bean(name = "blogPost")
    public BlogPostService blogPostService(){
        return new BlogPostServiceImpl();
    }

    @Bean(name = "wordPressBlogPost")
    public BlogPostService wordPressBlogPostService(){
        return new WordPressBlogPostServiceImpl();
    }

    @Bean(name = "mediumBlogPost")
    public BlogPostService meduimBlogPostService(){
        return new MediumBlogPostServiceImpl();
    }

}
