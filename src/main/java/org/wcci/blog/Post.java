package org.wcci.blog;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id; 
	
	private String postTitle;
	private String postBody;
	@ManyToOne
	private Author author;
	private LocalDate reviewDate = LocalDate.now(); 
	@ManyToOne
	private Genre genre;
	@ManyToMany
	private List<Tag> tags;
	
	public Post() {
	}
	
	public Post(String givenTitle, String givenPostBody, Author givenAuthor, 
			Genre givenGenre) {
		this.postTitle = givenTitle;
		this.postBody = givenPostBody;
		this.author = givenAuthor;
		this.genre = givenGenre;
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

	public Author getAuthor() {
		return author;
	}

	public LocalDate getReviewDate() {
		return reviewDate;
	}

	public Genre getGenre() {
		return genre;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
}
