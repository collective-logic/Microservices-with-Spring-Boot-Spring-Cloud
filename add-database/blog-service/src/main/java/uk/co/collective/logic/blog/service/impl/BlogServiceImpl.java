package uk.co.collective.logic.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.collective.logic.blog.model.Blog;
import uk.co.collective.logic.blog.model.exception.BlogNotFoundException;
import uk.co.collective.logic.blog.repository.BlogRepository;
import uk.co.collective.logic.blog.service.api.BlogService;

import java.util.*;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blog> getBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlog(String blogId) {
        return blogRepository.findById(blogId)
            .orElseThrow(BlogNotFoundException::new);
    }

    @Override
    public void createBlog(Blog blog) {

        blog.setCreatedOn(new Date());
        blogRepository.save(blog);
    }
}
