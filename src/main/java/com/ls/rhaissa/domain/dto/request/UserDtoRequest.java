package com.ls.rhaissa.domain.dto.request;
import com.ls.rhaissa.domain.model.BookEntity;
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
public class UserDtoRequest {

    private String nameUser;
    private String cpf;
    private LocalDate birthdayDate;
    private int ageUser;
    private String emailUser;
    private List<BookEntity> books;


}
