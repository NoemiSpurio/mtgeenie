package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.Card;
import com.nhy.mtgeenie.model.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository  extends JpaRepository<Card, String> {

    Optional<Card> findByNameAndSet(String name, Set set);

    @Modifying
    @Query(value = "DELETE co, ca " +
            "FROM card ca " +
            "LEFT JOIN cost co ON co.id = ca.cost_id " +
            "WHERE ca.id = :card_id", nativeQuery = true)
    Integer cascadeDelete(@Param("card_id") String id);
}
