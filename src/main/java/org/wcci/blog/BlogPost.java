package org.wcci.blog;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class BlogPost {
	@Id
	@GeneratedValue
	private Long id; 
	
	private String postTitle;
	private PostAuthor postAuthor;
	private PostGenre postGenre;
	private LocalDate reviewDate= LocalDate.now(); 
	
	public BlogPost() {
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
