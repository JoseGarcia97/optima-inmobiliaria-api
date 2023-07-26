package com.optimainmobiliaria.user.service;

import com.optimainmobiliaria.user.dto.CustomerDTO;
import com.optimainmobiliaria.user.model.Customer;
import com.optimainmobiliaria.user.model.JobCondition;
import com.optimainmobiliaria.user.model.MaritalStatus;
import com.optimainmobiliaria.user.repository.CustomerRepository;
import com.optimainmobiliaria.user.repository.JobConditionRepository;
import com.optimainmobiliaria.user.repository.MaritalStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final MaritalStatusRepository maritalStatusRepository;
    private final JobConditionRepository jobConditionRepository;

    @Override
    public Customer registerCustomer(CustomerDTO customerDTO) {

        MaritalStatus maritalStatus = maritalStatusRepository
                .findByCode(customerDTO.getMaritalStatusCode())
                .orElseThrow();
        JobCondition jobCondition = jobConditionRepository
                .findByCode(customerDTO.getJobConditionCode())
                .orElseThrow();

        Customer customer = Customer.builder()
                .firstName(customerDTO.getFirstName())
                .lastName(customerDTO.getLastName())
                .documentNumber(customerDTO.getDocumentNumber())
                .address(customerDTO.getAddress())
                .maritalStatus(maritalStatus)
                .profession(customerDTO.getProfession())
                .phoneNumber(customerDTO.getPhoneNumber())
                .email(customerDTO.getEmail())
                .jobCondition(jobCondition)
                .incomes(customerDTO.getIncomes())
                .build();

        return this.customerRepository.save(customer);
    }
}
