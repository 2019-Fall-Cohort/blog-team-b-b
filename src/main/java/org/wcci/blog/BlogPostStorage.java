package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.wcci.blog.BlogPost;

@Repository
public class BlogPostStorage {

		@Autowired 
		BlogPostRepository blogPostRepo;

		public BlogPostRepository addBlogPost(BlogPostRepository blogPostToAdd) {
			return blogPostRepo.save(blogPostToAdd);
		}
	}


