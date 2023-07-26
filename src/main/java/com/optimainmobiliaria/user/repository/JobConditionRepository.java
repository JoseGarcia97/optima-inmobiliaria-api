package com.optimainmobiliaria.user.repository;

import com.optimainmobiliaria.user.model.JobCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobConditionRepository extends JpaRepository<JobCondition, Integer> {
    Optional<JobCondition> findByCode(String code);
}