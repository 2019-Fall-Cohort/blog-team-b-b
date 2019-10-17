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
		
		Category category1 = new Category("Horror");
		Category category2 = new Category("Comedy");
		Category category3 = new Category("Fiction");
		Category category4 = new Category("Biography");
		Category category5 = new Category("NonFiction");
		Category category6 = new Category("Children");
		Category category7 = new Category("Teen");
		Category category8 = new Category("Self-Help");
		
		Tag tag1 = new Tag("page turner");
		Tag tag2 = new Tag("exhilirating");
		Tag tag3 = new Tag("breath taking");
		Tag tag4 = new Tag("thrlling");
		Tag tag5 = new Tag("meh");
		Tag tag6 = new Tag("exhausting");
		Tag tag7 = new Tag("creepy");
		Tag tag8 = new Tag("humorous");
		Tag tag9 = new Tag("adequate");
		Tag tag10 = new Tag("brilliant");
								
		categoryStorage.addCategory(category1);
		categoryStorage.addCategory(category2);
		categoryStorage.addCategory(category3);
		categoryStorage.addCategory(category4);
		categoryStorage.addCategory(category5);
		categoryStorage.addCategory(category6);
		categoryStorage.addCategory(category7);
		categoryStorage.addCategory(category8);
		
		tagStorage.addTag(tag1);
		tagStorage.addTag(tag2);
		tagStorage.addTag(tag3);
		tagStorage.addTag(tag4);
		tagStorage.addTag(tag5);
		tagStorage.addTag(tag6);
		tagStorage.addTag(tag7);
		tagStorage.addTag(tag8);
		tagStorage.addTag(tag9);
		tagStorage.addTag(tag10);
		
		
		Post post1 = new Post("First Post", "The Birds", "Jimmy Roe", 
				category1,"Scared me so much!");
		Post post2 = new Post("Second Post", "I Hope They Serve Beer in Hell", "Brian B.", 
				category2, "Reee-diculous!!!");
		Post post3 = new Post("Third Post", "Jane Eyre", "Barbara Taylor", 
				category3,"Read at least once every 5 years!");
		Post post4 = new Post("Fourth Post", "Dragon: Bruce Lee", "Charles Smith", 
				category4, "Left me Kicking!!!");
		Post post5 = new Post("Fifth Post", "This Changes Everything", "Mary D.", 
				category5,"Very frightening, but hopeful, too!");
		Post post6 = new Post("Sixth Post", "A Wrinkle in Time", "Polly Posey", 
				category6, "Loved it!!!");
		Post post7 = new Post("Seventh Post", "Thirteen: Officially a Teen", "Dinah Teeneger", 
				category7,"My parents need to read this!!!");
		Post post8 = new Post("Eighth Post", "Help for the Aspiring Coder", "Elon Tusk", 
				category8, "Hate It!!!");

		postStorage.addPost(post1);
		postStorage.addPost(post2);
		postStorage.addPost(post3);
		postStorage.addPost(post4);
		postStorage.addPost(post5);
		postStorage.addPost(post6);
		postStorage.addPost(post7);
		postStorage.addPost(post8);		
		
}