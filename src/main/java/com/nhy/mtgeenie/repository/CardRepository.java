package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository  extends JpaRepository<Card, String> {
}
