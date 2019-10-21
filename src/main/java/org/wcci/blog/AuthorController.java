package org.wcci.blog;

import java.time.LocalDate;
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
import org.wcci.reviewssite.Beer;
import org.wcci.reviewssite.Review;

@Controller
public class AuthorController {
	
	@Autowired
	private PostStorage postStorage;
	@Autowired
	private AuthorStorage authorStorage;
	@Autowired
	private GenreStorage genreStorage;
	@Autowired
	private TagStorage tagStorage;

	@GetMapping("/author")
	public String authorHomePage(Model model) {
		return "index";
	}
	
	@GetMapping("/all_authors")
	public String getAllAuthors(Model model) {
		model.addAttribute("authors", authorStorage.findAllTheAuthors());
		return "all_authors";
	}
	@GetMapping("/add_author")
	public String getAddPost(Model model) {
		model.addAttribute("authors", authorStorage.findAllTheAuthors());
		model.addAttribute("genres", genreStorage.findAllTheGenres());
		model.addAttribute("tags", tagStorage.findAllTheTags());
		return "add_author";
	}

}
