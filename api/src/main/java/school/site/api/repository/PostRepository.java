package school.site.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.site.api.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
}
