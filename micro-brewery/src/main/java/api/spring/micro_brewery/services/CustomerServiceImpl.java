package api.spring.micro_brewery.services;

import api.spring.micro_brewery.web_model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("James Brown").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer( UUID id, CustomerDto customerDto){
        log.debug("Updating customer with id {}", id);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("Deleting customer with id {}", id);
    }



}
