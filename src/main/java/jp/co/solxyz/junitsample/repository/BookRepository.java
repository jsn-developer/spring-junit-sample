package jp.co.solxyz.junitsample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.solxyz.junitsample.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findById(int id);
    public List<Book> findAll();
}
