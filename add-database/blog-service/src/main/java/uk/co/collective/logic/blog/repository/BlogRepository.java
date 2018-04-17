package uk.co.collective.logic.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.co.collective.logic.blog.model.Blog;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
@Repository
public interface BlogRepository extends JpaRepository<Blog, String> {
}
