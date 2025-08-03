package com.example.CatfruitTracker.service;

import com.example.CatfruitTracker.entity.Cat;
import com.example.CatfruitTracker.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// @Component tells Spring that it should be managed by the Spring container
// Spring will create an instance of this class and manage its life cycle

@Component
public class CatService {
    private final CatRepository catRepository;

    @Autowired
    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }
}
