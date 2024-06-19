package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository  extends JpaRepository<Type, String> {
}
