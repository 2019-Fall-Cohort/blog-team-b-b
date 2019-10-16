package org.wcci.blog;

import org.hibernate.boot.archive.scan.spi.ClassDescriptor.Categorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.wcci.blog.Genre;

@Repository
public class GenreStorage {

	@Autowired
	GenreRepository genreRepo;

	public Genre addGenre(Genre genreToAdd) {
		return genreRepo.save(genreToAdd);
	}
	
	public Genre findGenre(Long id) {
		return genreRepo.findById(id).get();
	}
	
	public Iterable<Genre> findAllTheGenres(){
		return genreRepo.findAll();
	}
	
}
