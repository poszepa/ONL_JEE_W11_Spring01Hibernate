package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findByEmail(String email);
    Author findByPesel(String pesel);
    List<Author> findByLastName(String lastName);

    @Query("SELECT a FROM Author a WHERE a.email LIKE :startWith%")
    List<Author> findByEmailStartWith(@Param("startWith")String startWith);

    @Query("SELECT a FROM Author a WHERE a.pesel LIKE :startWith%")
    List<Author> findByPeselStartWith(@Param("startWith")String startWith);
}
