package org.wcci.blog;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id
	@GeneratedValue
	private Long id; 
		
	private String tagName;
	@ManyToMany (mappedBy="tags")
	private List<Post> posts;
		
		public Tag() {
		}
		
		public Tag(String givenTagName, Post... givenPosts) {
			this.tagName = givenTagName;
			this.posts = Arrays.asList(givenPosts);
		}


}
