package uk.co.collective.logic.blog.service.impl;

import org.springframework.stereotype.Service;
import uk.co.collective.logic.blog.model.Blog;
import uk.co.collective.logic.blog.service.api.BlogService;

import java.util.*;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
@Service
public class BlogServiceImpl implements BlogService {

    // temporary store in place of Database for now
    private Map<String, Blog> tempStore;

    public BlogServiceImpl() {
        tempStore = new HashMap<>();
    }

    @Override
    public List<Blog> getBlogs() {
        return new ArrayList<>(tempStore.values());
    }

    @Override
    public Blog getBlog(String blogId) {
        return tempStore.get(blogId);
    }

    @Override
    public void createBlog(Blog blog) {

        blog.setId(UUID.randomUUID().toString());
        blog.setCreatedOn(new Date());

        tempStore.put(blog.getId(), blog);
    }
}
