package com.akanksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akanksha.model.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner,Integer>{

}
