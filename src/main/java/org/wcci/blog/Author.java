package org.wcci.blog;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long id; 
	
	private String authorName;
	@OneToMany (mappedBy = "author")
	private List<Post> posts;
	
	public Author() {
	}
	
	public Author(String name, Post... givenPosts) {
		this.authorName = name;
		this.posts = Arrays.asList(givenPosts);
	}

	public Long getId() {
		return id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public List<Post> getPosts() {
		return posts;
	}

}
