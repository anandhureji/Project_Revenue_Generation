package com.dumping.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dumping.demo.entity.BillRate;

@Repository
public interface BillRateRepository extends JpaRepository<BillRate, Integer> {

}
