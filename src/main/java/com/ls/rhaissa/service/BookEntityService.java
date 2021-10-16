package com.ls.rhaissa.service;
import com.ls.rhaissa.domain.dto.request.BookDtoRequest;
import com.ls.rhaissa.domain.dto.response.BookDtoResponse;
import com.ls.rhaissa.domain.model.BookEntity;
import com.ls.rhaissa.repository.BookEntityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class BookEntityService {

    @Autowired
    private BookEntityRepository bookEntityRepository;
    @Autowired
    private ModelMapper modelMapper;

    public BookDtoResponse saveBook(BookDtoRequest bookDtoRequest){

        /*
        observações para estudos
        a instancia da entidade livro recebe modelmapper e utiliza o método map presente em modelmapper.
        esse método faz com que seja mapeado os atributos recebidos no bookDtoRequest em BookEntity.class*/

        BookEntity bookEntity = modelMapper.map(bookDtoRequest, BookEntity.class);
        /*
        um método de uma instancia do repository de BookEntity é utilizado para salvar bookentity
         */
        bookEntityRepository.save(bookEntity);
        /*

         */
        return modelMapper.map(bookEntity, BookDtoResponse.class);
    }

    public BookDtoResponse findBookByIsbn(Long isbn) {
        BookEntity bookEntity = bookEntityRepository.findBookEntityByIsbn(isbn);
        return modelMapper.map(bookEntity, BookDtoResponse.class);

    }












}
