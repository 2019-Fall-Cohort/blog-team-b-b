package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.wcci.blog.Author;

@Repository
public class AuthorStorage {

	@Autowired
	AuthorRepository authorRepo;
		
	public Author addAuthor(Author authorToAdd) {
		return authorRepo.save(authorToAdd);
	}
	
	public Author findAuthor (Long id) {
		return authorRepo.findById(id).get();
	}
	
	public Iterable<Author> findAllTheAuthors(){
		return authorRepo.findAll();
	}

}
