package com.example.CatfruitTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserInventory {
    @Id
    private Long id;

    // seeds
    private int green_seed;
    private int purple_seed;
    private int red_seed;
    private int blue_seed;
    private int yellow_seed;
    private int epic_seed;
    private int aku_seed;
    private int elder_seed;
    private int gold_seed;

    // fruits
    private int green_fruit;
    private int purple_fruit;
    private int red_fruit;
    private int blue_fruit;
    private int yellow_fruit;
    private int epic_fruit;
    private int aku_fruit;
    private int elder_fruit;
    private int gold_fruit;

    // behemoth Stones
    private int purple_behemoth_stone;
    private int red_behemoth_stone;
    private int blue_behemoth_stone;
    private int green_behemoth_stone;
    private int yellow_behemoth_stone;
    private int epic_behemoth_stone;

    // Behemoth Gems
    private int purple_behemoth_gem;
    private int red_behemoth_gem;
    private int blue_behemoth_gem;
    private int green_behemoth_gem;
    private int yellow_behemoth_gem;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
