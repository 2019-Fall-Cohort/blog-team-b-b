package org.wcci.blog;

import org.springframework.data.repository.CrudRepository;

public class BlogPostRepository{
	
	@Repository
	public interface BlogPostRepository extends CrudRepository<BlogPostRepository, Long> {

	}


}
