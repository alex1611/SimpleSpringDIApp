import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.config.JavaConfig;
import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.ServiceManager;

public class MainApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        BlogPostService blogPostService = (BlogPostService) ctx.getBean("blogPost");
        BlogPost blogPost = new BlogPost();
        blogPost.setId(1L);
        blogPost.setTitle("Java test spring");
        blogPostService.savePost(blogPost);
        DataSource dataSource = ctx.getBean(DataSource.class);
        LOGGER.info(dataSource.toString());
        ServiceManager serviceManager = ctx.getBean(ServiceManager.class);
        serviceManager.sendBlogPost(blogPost);
        ((AnnotationConfigApplicationContext) ctx).close();




    }
}
