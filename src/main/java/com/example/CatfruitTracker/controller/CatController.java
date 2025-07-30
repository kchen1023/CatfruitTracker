// handles `/cats` and `/selected`

package com.example.CatfruitTracker.controller;

import com.example.CatfruitTracker.entity.RareCat;
import com.example.CatfruitTracker.entity.SuperRareCat;
import com.example.CatfruitTracker.repository.RareCatRepository;
import com.example.CatfruitTracker.repository.SuperRareCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CatController {
    @Autowired
    private RareCatRepository rareCatRepository;
    @Autowired
    private SuperRareCatRepository superRareCatRepository;

    @GetMapping("/rare_cats")
    public List<RareCat> getRareCats() {
        return rareCatRepository.findAll();
    }

    @GetMapping("/super_rare_cats")
    public List<SuperRareCat> getSuperRareCats() {
        return superRareCatRepository.findAll();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

//    @GetMapping("/cats")
}
