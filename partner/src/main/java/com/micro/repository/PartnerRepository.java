package com.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner,Integer>{

}
