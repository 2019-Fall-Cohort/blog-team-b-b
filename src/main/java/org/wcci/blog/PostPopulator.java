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
		
//		Tag tag1 = new Tag("interesting");
//		Tag tag2 = new Tag("exhilirating");
//		Tag tag3 = new Tag("helpful");
//		Tag tag4 = new Tag("thrilling");
//		Tag tag5 = new Tag("fascinating");
//		Tag tag6 = new Tag("exhausting");
//		Tag tag7 = new Tag("creepy");
//		Tag tag8 = new Tag("humorous");
//		Tag tag9 = new Tag("adequate");
//		Tag tag10 = new Tag("brilliant");
		
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
				author1, genre5);
		Post post2 = new Post("Second Post", "I Hope They Serve Beer in Hell", 
				author2, genre2);
		Post post3 = new Post("Third Post", "Jane Eyre", 
				author3, genre3);
		Post post4 = new Post("Fourth Post", "Dragon: Bruce Lee", 
				author4, genre4);
		Post post5 = new Post("Fifth Post", "This Changes Everything", 
				author5, genre5);
		Post post6 = new Post("Sixth Post", "A Wrinkle in Time", 
				author6, genre6);
		Post post7 = new Post("Seventh Post", "Thirteen: Officially a Teen", 
				author7, genre7);
		Post post8 = new Post("Eighth Post", "Help for the Aspiring Coder", 
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