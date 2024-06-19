package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository  extends JpaRepository<Cost, String> {
}
