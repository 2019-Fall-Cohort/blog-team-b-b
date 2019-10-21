package org.wcci.blog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.wcci.blog.PostStorage;
import org.wcci.blog.AuthorStorage;
import org.wcci.blog.GenreStorage;
import org.wcci.blog.TagStorage;
import org.wcci.blogsite.Category;
import org.wcci.blogsite.Review;
import org.wcci.blogsite.Tag;

@Controller
public class PostController {
	
	@Autowired
	private PostStorage postStorage;
	@Autowired
	private AuthorStorage authorStorage;
	@Autowired
	private GenreStorage genreStorage;
	@Autowired
	private TagStorage tagStorage;
	
	@GetMapping("/all_blogs")
	public String findAllThePosts(Model model) {
		model.addAttribute("posts", postStorage.findAllThePosts());
		return "all_blogs";
	}
	
	@GetMapping("/add_post")
	public String getAddPost(Model model) {
		model.addAttribute("authors", authorStorage.findAllTheAuthors());
		model.addAttribute("genres", genreStorage.findAllTheGenres());
		model.addAttribute("tags", tagStorage.findAllTheTags());
		return "add_post";
	}
	
	@PostMapping("/add")
	public String userAddPost(String postTitle, String postBody, 
			Long authorId, Long genreId, Long... tagList) {
		
		Author author = authorStorage.findAuthor(authorId);
		Genre genre = genreStorage.findGenre(genreId);
		List<Tag> tags = new ArrayList<Tag>();
		
		if (tagList != null) {
			for (Long id : tagList) {
				tags.add(tagStorage.findTag(id));
			}
			Post postToAdd = new Post(postTitle, postBody, author, genre, 
					tags);
		} else {
			Post postToAdd = new Post(postTitle, postBody, author, genre);
		}
				
		Post postToAdd = new Post(postTitle, postBody, author,
				genre);
		
		postToAdd.setPostDate(LocalDate.now()); 
		
		postStorage.addPost(postToAdd);
		Long postId = postToAdd.getPostId();
		return "redirect:/all_blogs"; //+ postId;
	}
	
	@GetMapping("/all_blogs/{postId}")
	public String singlePost(@PathVariable Long postId, Model model) {
		Post post = postStorage.findPost(postId);
		model.addAttribute("post", post);
		return "post";
	}


}
