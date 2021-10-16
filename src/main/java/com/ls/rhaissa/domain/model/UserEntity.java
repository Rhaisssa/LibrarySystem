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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user_entity")
public class UserEntity {

    //EScopo//Tipo lógico//Nome
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long idUser;

    @Column(name = "name_user")
    private String nameUser;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "birthday_date")
    private LocalDate birthdayDate;

    @Column(name = "age_user")
    private int ageUser;

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "books_user")
    /*
    One = UserEntity
    Many = BookEntity
    :. Um UserEntity pode ter Many Books
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<BookEntity> books;
}
