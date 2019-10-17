package org.wcci.blog;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	@Id
	@GeneratedValue
	private Long id;

	private String genre;
	@OneToMany (mappedBy = "genre")
	private List<Post> posts;

	public Genre() {
	}

	public Genre(String genre, Post... posts) {
		this.genre = genre;
		this.posts = Arrays.asList(posts);
	}
	
	public Long getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	public List<Post> getPosts() {
		return posts;
	}

}
