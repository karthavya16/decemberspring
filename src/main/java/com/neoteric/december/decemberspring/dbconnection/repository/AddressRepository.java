package com.neoteric.december.decemberspring.dbconnection.repository;

import com.neoteric.december.decemberspring.dbconnection.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
