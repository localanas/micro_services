package org.exam_chebihi;

import java.util.stream.Stream;

import org.exam_chebihi.dao.AuthorRepository;
import org.exam_chebihi.dao.BookItemsRepository;
import org.exam_chebihi.entities.Author;
import org.exam_chebihi.entities.BooksItem;
import org.exam_chebihi.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
//@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AuthorApplication {

	final BookItemsRepository bookItemsRepository;
	public AuthorApplication(BookItemsRepository bookItemsRepository) {
		this.bookItemsRepository = bookItemsRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthorApplication.class, args);
	}

	/*CommandLineRunner start(AuthorRepository authorRepository) {
		return args->{
			Stream.of("Author1","Author2","Author3").forEach(cn->{

				Author author = new Author(null,cn,"homme");
				authorRepository.save(author);
				//bookItemsRepository.save(new BooksItem(null, author ));
			});
			authorRepository.findAll().forEach(System.out::println);
			bookItemsRepository.findAll().forEach(System.out::println);

		};
	}

	 */
}
