package spring.java.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.EmailService;

public class BlogPostServiceImpl implements BlogPostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServiceImpl.class);
    @Autowired
    private DataSource dataSource;

    @Autowired
    private EmailService emailService;

    @Override
    public void savePost(BlogPost blogPost) {
        LOGGER.info("url : " + dataSource.getUrl());
        LOGGER.info("BlogPostServiceImpls: savePost has called");
        emailService.sendEmail();
    }
}
