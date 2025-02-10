package com.neoteric.december.decemberspring.dbconnection.service;

import com.neoteric.december.decemberspring.dbconnection.dto.CustomerDTO;
import com.neoteric.december.decemberspring.dbconnection.entity.Customer;
import com.neoteric.december.decemberspring.dbconnection.mapper.CustomerMapper;
import com.neoteric.december.decemberspring.dbconnection.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper personMapper;

    public CustomerDTO savePerson(CustomerDTO personDTO) {
        // Convert DTO to Entity
        Customer person = personMapper.toEntity(personDTO);

        // Save the person entity
        person = customerRepository.save(person);

        // Convert back to DTO and return
        return personMapper.toDTO(person);
    }
}
