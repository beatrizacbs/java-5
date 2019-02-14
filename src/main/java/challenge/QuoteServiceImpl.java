package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		Long maxValue = repository.count();
		Random random = new Random();
		Quote quote = repository.getRandomQuote(random.nextInt(maxValue.intValue()));
		if(quote.getActor() == null){
			return getQuote();
		}else{
			return quote;
		}
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		return null;
	}

}
