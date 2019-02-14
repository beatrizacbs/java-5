package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/quote")
public class QuoteController {

    @Autowired
    private QuoteService service;

    @GetMapping
    public Quote getRandomQuote(){
        return service.getQuote();
    }

    @GetMapping("/{actor}")
    public Quote getQuoteByActor(@PathVariable(name = "actor") String actor){
        return service.getQuoteByActor(actor);
    }

}
