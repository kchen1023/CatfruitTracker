package com.example.CatfruitTracker.controller;

import com.example.CatfruitTracker.entity.Cat;
import com.example.CatfruitTracker.repository.CatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CatController {
    private final CatRepository catRepository;

    public CatController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping
    public List<Cat> findAll() {
        return catRepository.findAll();
    }
}
