package org.wcci.blog;

import org.hibernate.boot.archive.scan.spi.ClassDescriptor.Categorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.wcci.blog.Post;

@Repository
public class PostStorage {

	@Autowired
	PostRepository postRepo;

	public Post addPost(Post postToAdd) {
		return postRepo.save(postToAdd);
	}
	
	public Post findPost(Long id) {
		return postRepo.findById(id).get();
	}
	
	public Iterable<Post> findAllThePosts(){
		return postRepo.findAll();
	}
//	
}
