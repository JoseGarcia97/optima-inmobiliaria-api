package com.optimainmobiliaria.user.service;

import com.optimainmobiliaria.user.dto.CustomerDTO;
import com.optimainmobiliaria.user.model.Customer;

public interface CustomerService {
    Customer registerCustomer(CustomerDTO customerDTO);
}
