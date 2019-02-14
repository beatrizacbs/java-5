package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		Quote quote = repository.getRandomQuote(getRandomId());
		if(quote.getActor() == null){
			return getQuote();
		}else{
			return quote;
		}
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> quotes = repository.getQuotesByActor(actor);
		return quotes.get(new Random().nextInt(quotes.size()));
	}

	private Integer getRandomId(){
		Long maxValue = repository.count();
		Random random = new Random();
		return random.nextInt(maxValue.intValue());
	}


}
