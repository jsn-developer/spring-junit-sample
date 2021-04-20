package jp.co.solxyz.junitsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jp.co.solxyz.junitsample.entity.Book;
import jp.co.solxyz.junitsample.service.BookService;

/**
 * BookController
 */
@RestController
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/")
    String index() {
        return "<h1>Hello World!</h1>";
    }

    @GetMapping("/book/{id}")
    Book searchBook(@PathVariable int id){
        return service.findById(id);
    }
    
}