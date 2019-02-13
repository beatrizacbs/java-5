package challenge;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface QuoteRepository extends MongoRepository<Quote, Integer> {

    @Query("SELECT q FROM Quote q WHERE q.id = :id")
    Quote getQuoteyId(@Param("id") int id);



}
