package api.spring.micro_brewery.services;

import api.spring.micro_brewery.web_model.CustomerDto;

import java.util.UUID;

public interface CustomerService{
    CustomerDto getCustomerById(UUID id);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}

