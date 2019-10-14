package org.wcci.blog;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BlogPost {
	@Id
	@GeneratedValue
	private Long id; 
	
	private String postTitle;
	private PostAuthor postAuthor;
	private PostGenre postGenre;
	private LocalDate reviewDate = LocalDate.now(); 
	
	public BlogPost(String title, PostAuthor author, PostGenre genre, LocalDate date) {
		this.postTitle = title;
		this.postAuthor = author;
		this.postGenre = genre;
		this.reviewDate = date;
	}
	
	public BlogPost() {
	}
	
	public Long getId() {
		return id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public PostAuthor getPostAuthor() {
		return postAuthor;
	}

	public void setPostAuthor(PostAuthor postAuthor) {
		this.postAuthor = postAuthor;
	}

	public PostGenre getPostGenre() {
		return postGenre;
	}
//
//	public void setPostGenre(PostGenre postGenre) {
//		this.postGenre = postGenre;
//	}

	public LocalDate getReviewDate() {
		return reviewDate;
	}

	
	
}
