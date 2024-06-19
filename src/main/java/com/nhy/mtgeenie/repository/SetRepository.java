package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetRepository  extends JpaRepository<Set, String> {
}
