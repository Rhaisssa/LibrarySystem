package com.ls.rhaissa.controller;

import com.ls.rhaissa.domain.dto.request.BookDtoRequest;
import com.ls.rhaissa.domain.dto.response.BookDtoResponse;
import com.ls.rhaissa.service.BookEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;

@RestController
@RequestMapping(value = "/book")
public class BookEntityController {

    /*
    Quando se quer utilizar os métodos/as funções etc de alguma classe ou interface utiliza se @Autowired
    Que é o mesmo que nesse caso:
    private BookEntityService bookEntityService = new BookEntityService();
    */
    @Autowired
    private BookEntityService bookEntityService;

    @Transactional
    @PostMapping
    public ResponseEntity<BookDtoResponse> saveNewBook(@RequestBody BookDtoRequest bookDtoRequest){
        BookDtoResponse bookDtoResponse = bookEntityService.saveBook(bookDtoRequest);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{isbn}")
                .buildAndExpand(bookDtoResponse.getIsbn()).toUri();
        return ResponseEntity.created(uri).body(bookDtoResponse);
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<?> getBookByIsbn(@PathVariable Long isbn){
        BookDtoResponse bookDtoResponse = bookEntityService.findBookByIsbn(isbn);
        return ResponseEntity.status(HttpStatus.OK).body(bookDtoResponse);
    }







}
