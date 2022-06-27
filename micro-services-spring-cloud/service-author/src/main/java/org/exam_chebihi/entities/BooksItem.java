package org.exam_chebihi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BooksItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Transient
    private List<Book> books;
    @ManyToOne
    private Author author;
}
