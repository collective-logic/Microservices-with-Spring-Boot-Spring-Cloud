package uk.co.collective.logic.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.co.collective.logic.blog.model.Blog;
import uk.co.collective.logic.blog.service.api.BlogService;

import java.util.List;
import java.util.Optional;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
@RestController
@RequestMapping("blogs")
public class BlogController {

    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Blog> getBlogs() {
        return blogService.getBlogs();
    }

    @RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
    public Blog getBlog(@PathVariable String blogId) {
        return blogService.getBlog(blogId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createBlog(@RequestBody Blog blog) {
        blogService.createBlog(blog);
    }
}
