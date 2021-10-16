package com.ls.rhaissa.repository;
import com.ls.rhaissa.domain.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {

    BookEntity findBookEntityByIsbn(Long isbn);
}
