package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.Card;
import com.nhy.mtgeenie.model.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository  extends JpaRepository<Card, String> {

    Optional<Card> findByNameAndSet(String name, Set set);
}
