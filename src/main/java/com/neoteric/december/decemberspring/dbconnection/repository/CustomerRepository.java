package com.neoteric.december.decemberspring.dbconnection.repository;

import com.neoteric.december.decemberspring.dbconnection.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository <Customer,Long>{
}
