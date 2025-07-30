package com.example.CatfruitTracker.repository;

import com.example.CatfruitTracker.entity.SuperRareCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SuperRareCatRepository extends JpaRepository<SuperRareCat,Integer> {
}
