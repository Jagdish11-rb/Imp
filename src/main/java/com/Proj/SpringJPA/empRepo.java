package com.Proj.SpringJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empRepo extends JpaRepository<Employee, Integer> {

}
