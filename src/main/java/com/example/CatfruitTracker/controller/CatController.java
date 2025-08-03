package com.example.CatfruitTracker.controller;

import com.example.CatfruitTracker.service.CatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/")
    public String showAllCats(Model model) {
        model.addAttribute("cats", catService.findAll());
        return "all_table";
    }

    @GetMapping("/rare")
    public String showRareCats(Model model) {
        model.addAttribute("cats", catService.findByRarity("rare"));
        return "rarity_table";
    }

    @GetMapping("/super_rare")
    public String showSuperRareCats(Model model) {
        model.addAttribute("cats", catService.findByRarity("super_rare"));
        return "rarity_table";
    }
}
