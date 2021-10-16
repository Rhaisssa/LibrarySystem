package com.ls.rhaissa.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_book_entity")
public class BookEntity {

    //EScopo//Tipo lógico//Nome
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "isbn")
        private Long isbn;

        @Column(name = "title")
        private String title;

        @Column(name = "description_book")
        private String descriptionBook;

        @Column(name = "publication_date")
        private LocalDate publicationDate;

        @Column(name = "age_book")
        private int ageBook;

        @OneToMany(cascade =  CascadeType.ALL)
        private List<CategoryBook> categoriesBook;

}
