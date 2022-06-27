package org.exam_chebihi.entities;

import javax.persistence.*;

import lombok.*;
import org.exam_chebihi.model.Book;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Author {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id ;
	private String name;
	private String sexe;
	@Transient
	private List<Book> books;
	
}
