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
import org.wcci.blog.TagStorage;
import org.wcci.blog.TagStorage;

@Controller 
public class TagController {

		@Autowired
		private PostStorage postStorage;
		@Autowired
		private AuthorStorage authorStorage;
		@Autowired
		private GenreStorage genreStorage;
		@Autowired
		private TagStorage tagStorage;
		
		@GetMapping("/all_tags")
		public String getAllTag(Model model) {
			model.addAttribute("tags", tagStorage.findAllTheTags());
			return "all_tags";
		}
		
		@GetMapping("/add_tag")
		public String createTag(Model model) {
			model.addAttribute("tags", tagStorage.findAllTheTags());
			return "add_tag";
		}

		@PostMapping("/add_tag")
		public String createTag2(String tagName) {
			Tag tagToAdd = new Tag(tagName);
			tagStorage.addTag(tagToAdd);
			return "redirect:/all_tags";
		}
		
		
		
}

