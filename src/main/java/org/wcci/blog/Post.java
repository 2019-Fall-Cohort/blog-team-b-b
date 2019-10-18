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

	@Override
	public String toString() {
		return "Post [id=" + id + ", postTitle=" + postTitle + ", postBody=" + postBody + ", author=" + author
				+ ", reviewDate=" + reviewDate + ", genre=" + genre + ", tags=" + tags + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((postBody == null) ? 0 : postBody.hashCode());
		result = prime * result + ((postTitle == null) ? 0 : postTitle.hashCode());
		result = prime * result + ((reviewDate == null) ? 0 : reviewDate.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
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
		Post other = (Post) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (postBody == null) {
			if (other.postBody != null)
				return false;
		} else if (!postBody.equals(other.postBody))
			return false;
		if (postTitle == null) {
			if (other.postTitle != null)
				return false;
		} else if (!postTitle.equals(other.postTitle))
			return false;
		if (reviewDate == null) {
			if (other.reviewDate != null)
				return false;
		} else if (!reviewDate.equals(other.reviewDate))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		return true;
	}

	
	
	
	
}
