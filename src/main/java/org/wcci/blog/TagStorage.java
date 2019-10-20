package org.wcci.blog;

//import org.hibernate.boot.archive.scan.spi.ClassDescriptor.Categorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.wcci.blog.Tag;

@Repository
public class TagStorage {

	@Autowired
	TagRepository tagRepo;

	public Tag addTag(Tag tagToAdd) {
		return tagRepo.save(tagToAdd);
	}
	
	public Tag findTag(Long id) {
		return tagRepo.findById(id).get();
	}
	
	public Iterable<Tag> findAllTheTags(){
		return tagRepo.findAll();
	}
	
}
