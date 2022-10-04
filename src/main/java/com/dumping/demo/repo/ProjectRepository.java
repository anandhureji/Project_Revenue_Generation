package com.dumping.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dumping.demo.entity.Project;



@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
