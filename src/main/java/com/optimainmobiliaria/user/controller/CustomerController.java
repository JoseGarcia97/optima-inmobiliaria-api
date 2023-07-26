package com.optimainmobiliaria.user.controller;

import com.optimainmobiliaria.user.dto.CustomerDTO;
import com.optimainmobiliaria.user.model.Customer;
import com.optimainmobiliaria.user.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * La clase CustomerController maneja las solicitudes HTTP relacionadas con los clientes.
 * Sirve como un controlador REST que mapea las solicitudes entrantes a los métodos apropiados.
 */
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody CustomerDTO customerDTO) {
        // Registrar el cliente a través del servicio
        Customer savedCustomer = customerService.registerCustomer(customerDTO);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
}
