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
//import org.wcci.blog.Author;

@Controller
public class GenreController {
	
	@Autowired
	private PostStorage postStorage;
	@Autowired
	private AuthorStorage authorStorage;
	@Autowired
	private GenreStorage genreStorage;
	@Autowired
	private TagStorage tagStorage;

	@GetMapping("/genre")
	public String authorHomePage(Model model) {
		return "index";
	}
	
	@GetMapping("/all_genres")
	public String getAllAuthors(Model model) {
		model.addAttribute("genres", authorStorage.findAllTheAuthors());
		return "all_genres";
	}
	
	@GetMapping("/add_genre")
	public String getAddAuthor(Model model) {
		model.addAttribute("authors", authorStorage.findAllTheAuthors());
		model.addAttribute("genres", genreStorage.findAllTheGenres());
		model.addAttribute("tags", tagStorage.findAllTheTags());
		return "add_genre";
	}

	@PostMapping("/add_genre")
    public String userAddAuthor(String genreName) {
        Genre genreToAdd = new Genre(genreName);
        System.out.println(genreName);
        Long id = genreToAdd. getGenreId();
        genreStorage.addGenre(genreToAdd);
        System.out.println(id);
        return "redirect:/all_genres";
    }
		
		
}
