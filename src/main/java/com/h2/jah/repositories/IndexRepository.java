package com.h2.jah.repositories;

import com.h2.jah.entities.Index;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface IndexRepository extends CrudRepository<Index, Long> {
public interface IndexRepository extends JpaRepository<Index, Long> {
    Index findByName(String name);
}
