package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Book;
import pl.coderslab.model.Category;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findBookByTitle(String title);
    List<Book> findBookByCategory(String category);
    Book findBookByCategoryId(Long id);
}
