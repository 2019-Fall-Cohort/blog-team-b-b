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
	private Long tagId; 
		
	private String tagName;
	@ManyToMany (mappedBy="tags")
	private List<Post> posts;
		
		public Tag() {
		}
		
		public Tag(String givenTagName, Post... posts) {
			this.tagName = givenTagName;
			this.posts = Arrays.asList(posts);
		}

		public Long getTagId() {
			return tagId;
		}

		public void setTagId(Long tagId) {
			this.tagId = tagId;
		}

		public String getTagName() {
			return tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public List<Post> getPosts() {
			return posts;
		}

		public void setPosts(List<Post> posts) {
			this.posts = posts;
		}

		@Override
		public String toString() {
			return "Tag [tagId=" + tagId + ", tagName=" + tagName + ", posts=" + posts + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((posts == null) ? 0 : posts.hashCode());
			result = prime * result + ((tagId == null) ? 0 : tagId.hashCode());
			result = prime * result + ((tagName == null) ? 0 : tagName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tag other = (Tag) obj;
			if (posts == null) {
				if (other.posts != null)
					return false;
			} else if (!posts.equals(other.posts))
				return false;
			if (tagId == null) {
				if (other.tagId != null)
					return false;
			} else if (!tagId.equals(other.tagId))
				return false;
			if (tagName == null) {
				if (other.tagName != null)
					return false;
			} else if (!tagName.equals(other.tagName))
				return false;
			return true;
		}

}
