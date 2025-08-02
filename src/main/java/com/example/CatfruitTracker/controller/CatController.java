// handles `/cats` and `/selected`

package com.example.CatfruitTracker.controller;

import com.example.CatfruitTracker.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CatController {
    @Autowired
    private CatRepository catRepository;

    public String index() {
        return "index";
    }

//    @GetMapping("/cats")
}
