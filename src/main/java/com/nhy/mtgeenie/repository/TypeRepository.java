package com.nhy.mtgeenie.repository;

import com.nhy.mtgeenie.enumeration.CardTypeEnum;
import com.nhy.mtgeenie.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository  extends JpaRepository<Type, String> {

    Optional<Type> findByName(CardTypeEnum name);
}
