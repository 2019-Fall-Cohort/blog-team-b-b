package org.wcci.blog;

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
		
		@GetMapping("/all_genres")
		public String getAllGenre(Model model) {
			model.addAttribute("genres", genreStorage.findAllTheGenres());
			return "all_genres";
		}
		
		
//		@GetMapping("/add_genre")
//	    public String getAddPost(Model model) {
////	        model.addAttribute("authors", authorStorage.findAllTheAuthors());
//	        model.addAttribute("genres", genreStorage.findAllTheGenres());
////	        model.addAttribute("tags", tagStorage.findAllTheTags());
//	        return "add_genre";
//		}
		
		
}
