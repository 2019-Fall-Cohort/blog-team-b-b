package org.wcci.blog;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;

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
public class HomeController {
	
	@Autowired
	private PostStorage postStorage;
	@Autowired
	private AuthorStorage authorStorage;
	@Autowired
	private GenreStorage genreStorage;
	@Autowired
	private TagStorage tagStorage;
	
	@GetMapping("/")
	public String welcomePage(Model model) {
		return "index";
	}
}
