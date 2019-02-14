package challenge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {

    @Query("SELECT q FROM Quote q WHERE q.id = :id")
    public Quote getRandomQuote(@Param("id") Integer id);


}
