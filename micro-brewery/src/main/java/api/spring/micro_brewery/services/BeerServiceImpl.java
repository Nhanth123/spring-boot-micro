package api.spring.micro_brewery.services;

import api.spring.micro_brewery.web_model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Galaxy Cat").
                beerStyle("Pale").
                build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("Delete beer with id {}", beerId);

    }

}
