package org.exam_chebihi;

import java.util.stream.Stream;

import org.exam_chebihi.dao.BookRepository;
import org.exam_chebihi.entities.Book;
import org.exam_chebihi.model.Author;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
//@EnableDiscoveryClient
@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	CommandLineRunner start(BookRepository bookRepository) {
		return args->{
			Stream.of("Book1","Book2","Book3").forEach(cn->{
				bookRepository.save(new Book("isbn"+cn,"toto", 1,123));
			});
			bookRepository.findAll().forEach(System.out::println);
		};
	}
}
