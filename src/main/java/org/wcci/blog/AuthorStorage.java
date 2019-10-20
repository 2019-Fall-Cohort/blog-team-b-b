package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorStorage {

	@Autowired
	AuthorRepository authorRepo;
		
	public Author addAuthor(Author authorToAdd) {
		return authorRepo.save(authorToAdd);
	}
	
	

}
