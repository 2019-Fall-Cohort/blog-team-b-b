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
import org.wcci.blog.Author;

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
	
	@GetMapping("/all_authors")
	public String getAllAuthors(Model model) {
		model.addAttribute("authors", authorStorage.findAllTheAuthors());
		return "all_authors";
	}
	
	@GetMapping("/add_author")
	public String getAddAuthor(Model model) {
		model.addAttribute("authors", authorStorage.findAllTheAuthors());
		return "add_author";
	}

	@PostMapping("/add_author")
	public String userAddAuthor(String authorName) {
		Author authorToAdd = new Author(authorName);
		authorStorage.addAuthor(authorToAdd);
		return "redirect:/all_authors";
	}
}
