package jp.co.solxyz.junitsample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.solxyz.junitsample.entity.Book;
import jp.co.solxyz.junitsample.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    BookRepository repository;

    public Book findById(int id) {
        return repository.findById(id);
    }

}
