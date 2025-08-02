package com.example.CatfruitTracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@Entity
public class Cat {
    @Id
    @Column(name = "id")
    private Integer id;
    private String name;
    private String rarity;

    // seeds
    private int greenSeed;
    private int purpleSeed;
    private int redSeed;
    private int blueSeed;
    private int yellowSeed;
    private int epicSeed;
    private int akuSeed;
    private int elderSeed;
    private int goldSeed;

    // fruits
    private int greenFruit;
    private int purpleFruit;
    private int redFruit;
    private int blueFruit;
    private int yellowFruit;
    private int epicFruit;
    private int akuFruit;
    private int elderFruit;
    private int goldFruit;

    // behemoth stones
    private int purpleBehemothStone;
    private int redBehemothStone;
    private int blueBehemothStone;
    private int greenBehemothStone;
    private int yellowBehemothStone;
    private int epicBehemothStone;

    // behemoth gems
    private int purpleBehemothGem;
    private int redBehemothGem;
    private int blueBehemothGem;
    private int greenBehemothGem;
    private int yellowBehemothGem;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    // Seeds
    public int getGreenSeed() {
        return greenSeed;
    }

    public int getPurpleSeed() {
        return purpleSeed;
    }

    public int getRedSeed() {
        return redSeed;
    }

    public int getBlueSeed() {
        return blueSeed;
    }

    public int getYellowSeed() {
        return yellowSeed;
    }

    public int getEpicSeed() {
        return epicSeed;
    }

    public int getAkuSeed() {
        return akuSeed;
    }

    public int getElderSeed() {
        return elderSeed;
    }

    public int getGoldSeed() {
        return goldSeed;
    }

    // Fruits
    public int getGreenFruit() {
        return greenFruit;
    }

    public int getPurpleFruit() {
        return purpleFruit;
    }

    public int getRedFruit() {
        return redFruit;
    }

    public int getBlueFruit() {
        return blueFruit;
    }

    public int getYellowFruit() {
        return yellowFruit;
    }

    public int getEpicFruit() {
        return epicFruit;
    }

    public int getAkuFruit() {
        return akuFruit;
    }

    public int getElderFruit() {
        return elderFruit;
    }

    public int getGoldFruit() {
        return goldFruit;
    }

    // Behemoth Stones
    public int getPurpleBehemothStone() {
        return purpleBehemothStone;
    }

    public int getRedBehemothStone() {
        return redBehemothStone;
    }

    public int getBlueBehemothStone() {
        return blueBehemothStone;
    }

    public int getGreenBehemothStone() {
        return greenBehemothStone;
    }

    public int getYellowBehemothStone() {
        return yellowBehemothStone;
    }

    public int getEpicBehemothStone() {
        return epicBehemothStone;
    }

    // Behemoth Gems
    public int getPurpleBehemothGem() {
        return purpleBehemothGem;
    }

    public int getRedBehemothGem() {
        return redBehemothGem;
    }

    public int getBlueBehemothGem() {
        return blueBehemothGem;
    }

    public int getGreenBehemothGem() {
        return greenBehemothGem;
    }

    public int getYellowBehemothGem() {
        return yellowBehemothGem;
    }


}


