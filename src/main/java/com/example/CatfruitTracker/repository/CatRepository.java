package com.example.CatfruitTracker.repository;

import com.example.CatfruitTracker.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// @Repository takes care of accessing database (CRUD operations)

@Repository
public interface CatRepository extends JpaRepository<Cat,Integer> {
    Optional<Cat> findByName(String name);
}
