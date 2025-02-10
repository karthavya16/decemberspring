package com.neoteric.december.decemberspring.dbconnection.mapper;

import com.neoteric.december.decemberspring.dbconnection.dto.AddressDTO;
import com.neoteric.december.decemberspring.dbconnection.dto.CustomerDTO;
import com.neoteric.december.decemberspring.dbconnection.dto.NomineeDTO;
import com.neoteric.december.decemberspring.dbconnection.entity.Address;
import com.neoteric.december.decemberspring.dbconnection.entity.Customer;
import com.neoteric.december.decemberspring.dbconnection.entity.Nominee;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {


public Customer toEntity(CustomerDTO personDTO){
    Customer person=new Customer();
    person.setEmail(personDTO.getEmail());
    person.setName(personDTO.getName());
    person.setMobileNumber(personDTO.getMobileNumber());
    Address address = new Address();
    address.setStreet(personDTO.getAddress().getStreet());
    address.setCity(personDTO.getAddress().getCity());
    address.setState(personDTO.getAddress().getState());
    address.setPincode(personDTO.getAddress().getPincode());

    person.setAddress(address);

    Nominee nominee = new Nominee();
    nominee.setName(personDTO.getNominee().getName());
    nominee.setRelation(personDTO.getNominee().getRelation());

    Address nomineeAddress = new Address();
    nomineeAddress.setStreet(personDTO.getNominee().getAddress().getStreet());
    nomineeAddress.setCity(personDTO.getNominee().getAddress().getCity());
    nomineeAddress.setState(personDTO.getNominee().getAddress().getState());
    nomineeAddress.setPincode(personDTO.getNominee().getAddress().getPincode());

    nominee.setAddress(nomineeAddress);

    person.setNominee(nominee);

    return person;
}

    public CustomerDTO toDTO(Customer person) {
        CustomerDTO personDTO = new CustomerDTO();
        personDTO.setEmail(person.getEmail());
        personDTO.setName(person.getName());
        personDTO.setMobileNumber(person.getMobileNumber());

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setStreet(person.getAddress().getStreet());
        addressDTO.setCity(person.getAddress().getCity());
        addressDTO.setState(person.getAddress().getState());
        addressDTO.setPincode(person.getAddress().getPincode());

        personDTO.setAddress(addressDTO);

        NomineeDTO nomineeDTO = new NomineeDTO();
        nomineeDTO.setName(person.getNominee().getName());
        nomineeDTO.setRelation(person.getNominee().getRelation());

        AddressDTO nomineeAddressDTO = new AddressDTO();
        nomineeAddressDTO.setStreet(person.getNominee().getAddress().getStreet());
        nomineeAddressDTO.setCity(person.getNominee().getAddress().getCity());
        nomineeAddressDTO.setState(person.getNominee().getAddress().getState());
        nomineeAddressDTO.setPincode(person.getNominee().getAddress().getPincode());

        nomineeDTO.setAddress(nomineeAddressDTO);

        personDTO.setNominee(nomineeDTO);

        return personDTO;
    }
}

