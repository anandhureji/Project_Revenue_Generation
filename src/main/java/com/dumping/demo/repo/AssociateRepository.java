package com.dumping.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dumping.demo.entity.Associate;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, Integer> {

}