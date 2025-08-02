package com.example.CatfruitTracker.repository;

import com.example.CatfruitTracker.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CatRepository extends JpaRepository<Cat,Integer> {

}
