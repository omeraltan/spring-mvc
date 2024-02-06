package com.spring.mvc.studies.web.annotations;

import com.spring.mvc.studies.web.annotations.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("books")
public class SimpleBookController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id){
        return findBookById(id);
    }

    private Book findBookById(int id){
        return null;
    }
}
