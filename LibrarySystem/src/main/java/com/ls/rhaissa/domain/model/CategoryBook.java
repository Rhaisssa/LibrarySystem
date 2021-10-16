package com.ls.rhaissa.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_category_book")
public class CategoryBook {

    //EScopo//Tipo lógico//Nome
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long idCategory;

    @Column(name = "type_book")
    private String typeBook;

    @Column(name = "description_category")
    private String descriptionCategory;
}
