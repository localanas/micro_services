package org.exam_chebihi.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.exam_chebihi.model.Author;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
	@Id @Column(length = 30)
	private String isbn ;
	private String title ;
	private int author_id;
	private double price ;
	
}
