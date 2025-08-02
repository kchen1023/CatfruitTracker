package com.example.CatfruitTracker;

import com.example.CatfruitTracker.entity.Cat;
import com.example.CatfruitTracker.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
