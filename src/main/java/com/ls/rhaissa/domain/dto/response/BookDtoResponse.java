package com.ls.rhaissa.domain.dto.response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDtoResponse {

    private Long isbn;
    private String title;
    private String descriptionBook;
    private LocalDate publicationDate;
    private int ageBook;
    private String author;
}
