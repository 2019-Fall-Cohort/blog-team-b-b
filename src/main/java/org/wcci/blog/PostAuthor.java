package org.wcci.blog;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class PostAuthor {
	@Id
	@GeneratedValue
	private Long id; 
	
	private String authorName;
	private List<BlogPost> blogPosts;
	
	public PostAuthor() {
	}
	
	public PostAuthor(String name, BlogPost... posts) {
		this.authorName = name;
		this.blogPosts = Arrays.asList(posts);
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getAuthorName() {
		return authorName;
	}

//	public void setAuthorName(String authorName) {
//		this.authorName = authorName;
//	}

	public List<BlogPost> getBlogPosts() {
		return blogPosts;
	}

//	public void setBlogPosts(List<BlogPost> blogPosts) {
//		this.blogPosts = blogPosts;
//	}
	
	

}
