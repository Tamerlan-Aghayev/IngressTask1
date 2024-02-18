package com.company.ingress.repository;

import com.company.ingress.entity.CountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRepository extends JpaRepository<CountEntity, Long> {
    @Query(value = "SELECT * FROM count_entity c LIMIT 1", nativeQuery = true)
    CountEntity getFirstElement();
    long count();
}
