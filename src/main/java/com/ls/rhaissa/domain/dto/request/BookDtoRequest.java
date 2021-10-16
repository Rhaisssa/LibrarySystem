package com.ls.rhaissa.domain.dto.request;
import com.ls.rhaissa.domain.model.CategoryBook;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDtoRequest {

    private String title;
    private String descriptionBook;
    private LocalDate publicationDate;
    private int ageBook;
    private List<CategoryBook> categoriesBook;
    private String author;
}
