package api.spring.micro_brewery.services;

import api.spring.micro_brewery.web_model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Galaxy Cat").
                beerStyle("Pale").
                build();
    }
}
