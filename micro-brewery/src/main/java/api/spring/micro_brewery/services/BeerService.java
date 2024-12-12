package api.spring.micro_brewery.services;

import api.spring.micro_brewery.web_model.BeerDto;

import java.util.UUID;

public interface BeerService{
    BeerDto getBeerById(UUID id);

    BeerDto saveNewBeer(BeerDto beerDto);
}

