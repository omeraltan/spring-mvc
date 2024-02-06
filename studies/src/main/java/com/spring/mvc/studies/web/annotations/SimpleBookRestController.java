package com.spring.mvc.studies.web.annotations;

import com.spring.mvc.studies.web.annotations.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book-rest")
public class SimpleBookRestController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public Book getbook(@PathVariable int id){
        return findBookById(id);
    }

    private Book findBookById(int id){
        return null;
    }
}
