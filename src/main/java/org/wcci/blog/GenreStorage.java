package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenreStorage {

	@Autowired
	GenreRepository genreRepo;

	public Genre addGenre(Genre genreToAdd) {
		return genreRepo.save(genreToAdd);
	}
}
