package com.neoteric.december.decemberspring.dbconnection.controller;

import com.neoteric.december.decemberspring.dbconnection.dto.CustomerDTO;

import com.neoteric.december.decemberspring.dbconnection.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customer){
        return customerService.savePerson(customer);
    }

}
