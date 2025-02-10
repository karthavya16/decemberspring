package com.neoteric.december.decemberspring.dbconnection.repository;

import com.neoteric.december.decemberspring.dbconnection.entity.Nominee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomineeRepository  extends JpaRepository<Nominee,Long> {
}
