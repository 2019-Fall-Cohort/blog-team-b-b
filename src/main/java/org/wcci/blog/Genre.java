package org.wcci.blog;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {
	@Id
	@GeneratedValue
	private Long id;

	private String genre;
	private List<BlogPost> posts;

	public Genre() {
	}

	public Genre(String genre, BlogPost... posts) {
		this.genre = genre;
		this.posts = Arrays.asList(posts);
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}


}
