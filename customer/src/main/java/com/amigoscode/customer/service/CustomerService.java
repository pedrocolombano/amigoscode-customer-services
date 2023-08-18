package com.amigoscode.customer.service;

import com.amigoscode.customer.dto.request.CustomerRegisterDTO;
import com.amigoscode.customer.entity.Customer;
import com.amigoscode.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Transactional
    public void registerCustomer(final CustomerRegisterDTO customerRegisterDTO) {
        Customer customer = Customer.builder()
                .firstName(customerRegisterDTO.getFirstName())
                .lastName(customerRegisterDTO.getLastName())
                .email(customerRegisterDTO.getEmail())
                .build();

        //TODO: check if email is valid
        //TODO: check if email is not taken
        customerRepository.save(customer);
    }

}
