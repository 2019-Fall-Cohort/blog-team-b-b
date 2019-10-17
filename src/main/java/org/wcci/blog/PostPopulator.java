package org.wcci.blog;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostPopulator implements CommandLineRunner {
	
	@Autowired
	private PostStorage postStorage;
	@Autowired
	private AuthorStorage authorStorage;
	@Autowired
	private GenreStorage genreStorage;
	@Autowired
	private TagStorage tagStorage;
	
	@Override
	public void run(String... args) throws Exception {
		
		Genre  genre1 = new Genre("Travel");
		Genre  genre2 = new Genre("Comedy");
		Genre  genre3 = new Genre("Advice");
		Genre  genre4 = new Genre("Biography");
		Genre  genre5 = new Genre("Celebrity");
		Genre  genre6 = new Genre("Family");
		Genre  genre7 = new Genre("Teens");
		Genre  genre8 = new Genre("Self-Help");
		
//		Tag tag1 = new Tag("Interesting");
//		Tag tag2 = new Tag("exhilirating");
//		Tag tag3 = new Tag("Helpful");
//		Tag tag4 = new Tag("thrilling");
//		Tag tag5 = new Tag("Fascinating");
//		Tag tag6 = new Tag("exhausting");
//		Tag tag7 = new Tag("creepy");
//		Tag tag8 = new Tag("humorous");
//		Tag tag9 = new Tag("adequate");
//		Tag tag10 = new Tag("brilliant");
								
		genreStorage.addGenre (genre1);
		genreStorage.addGenre (genre2);
		genreStorage.addGenre (genre3);
		genreStorage.addGenre (genre4);
		genreStorage.addGenre (genre5);
		genreStorage.addGenre (genre6);
		genreStorage.addGenre (genre7);
		genreStorage.addGenre (genre8);
		
//		tagStorage.addTag(tag1);
//		tagStorage.addTag(tag2);
//		tagStorage.addTag(tag3);
//		tagStorage.addTag(tag4);
//		tagStorage.addTag(tag5);
//		tagStorage.addTag(tag6);
//		tagStorage.addTag(tag7);
//		tagStorage.addTag(tag8);
//		tagStorage.addTag(tag9);
//		tagStorage.addTag(tag10);             
		
		Post post1 = new Post("First Post", "Taylor Swift found new boyfriend", 
				"Jimmy Roe", genre5);
		Post post2 = new Post("Second Post", "I Hope They Serve Beer in Hell", "Brian B.", 
				genre2, "Reee-diculous!!!");
		Post post3 = new Post("Third Post", "Jane Eyre", "Barbara Taylor", 
				genre3,"Read at least once every 5 years!");
		Post post4 = new Post("Fourth Post", "Dragon: Bruce Lee", "Charles Smith", 
				genre4, "Left me Kicking!!!");
		Post post5 = new Post("Fifth Post", "This Changes Everything", "Mary D.", 
				genre5,"Very frightening, but hopeful, too!");
		Post post6 = new Post("Sixth Post", "A Wrinkle in Time", "Polly Posey", 
				genre6, "Loved it!!!");
		Post post7 = new Post("Seventh Post", "Thirteen: Officially a Teen", "Dinah Teeneger", 
				genre7,"My parents need to read this!!!");
		Post post8 = new Post("Eighth Post", "Help for the Aspiring Coder", "Elon Tusk", 
				genre8, "Hate It!!!");

		postStorage.addPost(post1);
		postStorage.addPost(post2);
		postStorage.addPost(post3);
		postStorage.addPost(post4);
		postStorage.addPost(post5);
		postStorage.addPost(post6);
		postStorage.addPost(post7);
		postStorage.addPost(post8);		
		
}