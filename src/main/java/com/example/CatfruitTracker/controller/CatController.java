// handles `/cats` and `/selected`

package com.example.CatfruitTracker.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class CatController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

//    @GetMapping("/cats")
}
