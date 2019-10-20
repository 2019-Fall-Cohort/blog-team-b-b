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
		
		Author author1 = new Author("Jimmy Roe");
		Author author2 = new Author("Wayne Newton");
		Author author3 = new Author("Marcus Mumford");
		Author author4 = new Author("Jennifer Aniston");
		Author author5 = new Author("Peggy Ford");
		Author author6 = new Author("Russ Teller");
		Author author7 = new Author("James Dean");
		Author author8 = new Author("Hercules Leon");
								
		authorStorage.addAuthor(author1);
		authorStorage.addAuthor(author2);
		authorStorage.addAuthor(author3);
		authorStorage.addAuthor(author4);
		authorStorage.addAuthor(author5);
		authorStorage.addAuthor(author6);
		authorStorage.addAuthor(author7);
		authorStorage.addAuthor(author8);
		
		Genre genre1 = new Genre("Travel");
		Genre genre2 = new Genre("Comedy");
		Genre genre3 = new Genre("Advice");
		Genre genre4 = new Genre("Biography");
		Genre genre5 = new Genre("Celebrity");
		Genre genre6 = new Genre("Family");
		Genre genre7 = new Genre("Teens");
		Genre genre8 = new Genre("Self-Help");
								
		genreStorage.addGenre(genre1);
		genreStorage.addGenre(genre2);
		genreStorage.addGenre(genre3);
		genreStorage.addGenre(genre4);
		genreStorage.addGenre(genre5);
		genreStorage.addGenre(genre6);
		genreStorage.addGenre(genre7);
		genreStorage.addGenre(genre8);
		
		Tag tag1 = new Tag("interesting");
		Tag tag2 = new Tag("exhilirating");
		Tag tag3 = new Tag("helpful");
		Tag tag4 = new Tag("thrilling");
		Tag tag5 = new Tag("fascinating");
		Tag tag6 = new Tag("exhausting");
		Tag tag7 = new Tag("creepy");
		Tag tag8 = new Tag("humorous");
		Tag tag9 = new Tag("adequate");
		Tag tag10 = new Tag("brilliant");
		
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
		
		Post post1 = new Post("Post Title 1", "Tuvalu is the new Bali. Let's all go there this winter!", 
				author1, genre1);
		Post post2 = new Post("Post Title 2", "If you love comedy, you'll love Tina Fey's new movie! Don't miss it when it comes to theatres in December!", 
				author2, genre2);
		Post post3 = new Post("Post Title 3", "If you want to live a simpler life, you must de-clutter at least once per month.", 
				author3, genre3);
		Post post4 = new Post("Post Title 4", "Bruce Lee was an enigmatic hero. It feels like no-one really knew him. And they didn't.", 
				author4, genre4);
		Post post5 = new Post("Post Title 5", "Taylor Swift found a new boyfriend! All boys under age 17 cried!", 
				author5, genre5);
		Post post6 = new Post("Post Title 6", "Boo at the Zoo is a great time! Bring the kids (or the grandkids) and have a blast!", 
				author6, genre6);
		Post post7 = new Post("Post Title 7", "The modern teen has a complex world, that we older people can barely imagine. We faced ridicule in person; they face it on their phones.", 
				author7, genre7);
		Post post8 = new Post("Post Title 8", "You can learn to code, but if you want to survive in the world of software development, you must develop soft skills.", 
				author8, genre8);

		postStorage.addPost(post1);
		postStorage.addPost(post2);
		postStorage.addPost(post3);
		postStorage.addPost(post4);
		postStorage.addPost(post5);
		postStorage.addPost(post6);
		postStorage.addPost(post7);
		postStorage.addPost(post8);		
		
	}
	
}