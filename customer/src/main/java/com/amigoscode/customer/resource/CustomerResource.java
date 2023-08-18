package com.amigoscode.customer.resource;

import com.amigoscode.customer.dto.request.CustomerRegisterDTO;
import com.amigoscode.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@Slf4j
@RequiredArgsConstructor
public class CustomerResource {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Void> registerCustomer(@RequestBody CustomerRegisterDTO customerRegisterDTO) {
        log.info("New customer registration: {}", customerRegisterDTO);
        customerService.registerCustomer(customerRegisterDTO);
        return ResponseEntity.status(HttpStatus.CREATED.value()).build();
    }

}
