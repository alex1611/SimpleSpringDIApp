package spring.java.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

public class MediumBlogPostServiceImpl implements BlogPostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MediumBlogPostServiceImpl.class);
    @Override
    public void savePost(BlogPost blogPost) {
        LOGGER.info("MediumBlogPostServiceImpl : save post has called");
    }
}
