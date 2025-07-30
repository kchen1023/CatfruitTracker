package com.example.CatfruitTracker.repository;

import com.example.CatfruitTracker.entity.RareCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RareCatRepository extends JpaRepository<RareCat,Integer> {
}
