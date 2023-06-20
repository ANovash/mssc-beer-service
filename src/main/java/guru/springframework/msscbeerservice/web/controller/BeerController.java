package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerPageList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDto saveNewBeer(@RequestBody BeerDto beerDto) {
        return BeerDto.builder().build();
    }

    @GetMapping("/{beerId}")
    public BeerDto getBeerById(@PathVariable UUID beerId) {
        return BeerDto.builder().build();
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public BeerDto updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        return BeerDto.builder().build();
    }

    @GetMapping
    public BeerPageList listBeers() {
        return null;
    }
}
