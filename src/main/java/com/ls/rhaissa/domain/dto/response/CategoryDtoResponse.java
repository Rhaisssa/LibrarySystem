package com.ls.rhaissa.domain.dto.response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDtoResponse {

    private Long idCategory;
    private String typeBook;
    private String descriptionCategory;
}
