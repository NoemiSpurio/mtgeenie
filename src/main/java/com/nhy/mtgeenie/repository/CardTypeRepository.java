package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.model.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardTypeRepository  extends JpaRepository<CardType, String> {
}
