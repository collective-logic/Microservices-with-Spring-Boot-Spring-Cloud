package uk.co.collective.logic.blog.service.api;

import uk.co.collective.logic.blog.model.Blog;

import java.util.List;
import java.util.Optional;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
public interface BlogService {

    List<Blog> getBlogs();

    Blog getBlog(String blogId);

    void createBlog(Blog blog);
}
