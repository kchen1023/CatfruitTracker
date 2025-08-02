package com.example.CatfruitTracker.entity;

import jakarta.persistence.*;

// @Entity represents a table in data

@Entity
@Table(name = "all_cats")
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

    public Cat(Integer id, String name, String rarity, int greenSeed, int purpleSeed, int redSeed, int blueSeed, int yellowSeed, int epicSeed, int akuSeed, int elderSeed, int goldSeed, int greenFruit, int purpleFruit, int redFruit, int blueFruit, int yellowFruit, int epicFruit, int akuFruit, int elderFruit, int goldFruit, int purpleBehemothStone, int redBehemothStone, int blueBehemothStone, int greenBehemothStone, int yellowBehemothStone, int epicBehemothStone, int purpleBehemothGem, int redBehemothGem, int blueBehemothGem, int greenBehemothGem, int yellowBehemothGem) {
        this.id = id;
        this.name = name;
        this.rarity = rarity;
        this.greenSeed = greenSeed;
        this.purpleSeed = purpleSeed;
        this.redSeed = redSeed;
        this.blueSeed = blueSeed;
        this.yellowSeed = yellowSeed;
        this.epicSeed = epicSeed;
        this.akuSeed = akuSeed;
        this.elderSeed = elderSeed;
        this.goldSeed = goldSeed;
        this.greenFruit = greenFruit;
        this.purpleFruit = purpleFruit;
        this.redFruit = redFruit;
        this.blueFruit = blueFruit;
        this.yellowFruit = yellowFruit;
        this.epicFruit = epicFruit;
        this.akuFruit = akuFruit;
        this.elderFruit = elderFruit;
        this.goldFruit = goldFruit;
        this.purpleBehemothStone = purpleBehemothStone;
        this.redBehemothStone = redBehemothStone;
        this.blueBehemothStone = blueBehemothStone;
        this.greenBehemothStone = greenBehemothStone;
        this.yellowBehemothStone = yellowBehemothStone;
        this.epicBehemothStone = epicBehemothStone;
        this.purpleBehemothGem = purpleBehemothGem;
        this.redBehemothGem = redBehemothGem;
        this.blueBehemothGem = blueBehemothGem;
        this.greenBehemothGem = greenBehemothGem;
        this.yellowBehemothGem = yellowBehemothGem;
    }

    public Cat() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getGreenSeed() {
        return greenSeed;
    }

    public void setGreenSeed(int greenSeed) {
        this.greenSeed = greenSeed;
    }

    public int getPurpleSeed() {
        return purpleSeed;
    }

    public void setPurpleSeed(int purpleSeed) {
        this.purpleSeed = purpleSeed;
    }

    public int getRedSeed() {
        return redSeed;
    }

    public void setRedSeed(int redSeed) {
        this.redSeed = redSeed;
    }

    public int getBlueSeed() {
        return blueSeed;
    }

    public void setBlueSeed(int blueSeed) {
        this.blueSeed = blueSeed;
    }

    public int getYellowSeed() {
        return yellowSeed;
    }

    public void setYellowSeed(int yellowSeed) {
        this.yellowSeed = yellowSeed;
    }

    public int getEpicSeed() {
        return epicSeed;
    }

    public void setEpicSeed(int epicSeed) {
        this.epicSeed = epicSeed;
    }

    public int getAkuSeed() {
        return akuSeed;
    }

    public void setAkuSeed(int akuSeed) {
        this.akuSeed = akuSeed;
    }

    public int getElderSeed() {
        return elderSeed;
    }

    public void setElderSeed(int elderSeed) {
        this.elderSeed = elderSeed;
    }

    public int getGoldSeed() {
        return goldSeed;
    }

    public void setGoldSeed(int goldSeed) {
        this.goldSeed = goldSeed;
    }

    public int getGreenFruit() {
        return greenFruit;
    }

    public void setGreenFruit(int greenFruit) {
        this.greenFruit = greenFruit;
    }

    public int getPurpleFruit() {
        return purpleFruit;
    }

    public void setPurpleFruit(int purpleFruit) {
        this.purpleFruit = purpleFruit;
    }

    public int getRedFruit() {
        return redFruit;
    }

    public void setRedFruit(int redFruit) {
        this.redFruit = redFruit;
    }

    public int getBlueFruit() {
        return blueFruit;
    }

    public void setBlueFruit(int blueFruit) {
        this.blueFruit = blueFruit;
    }

    public int getYellowFruit() {
        return yellowFruit;
    }

    public void setYellowFruit(int yellowFruit) {
        this.yellowFruit = yellowFruit;
    }

    public int getEpicFruit() {
        return epicFruit;
    }

    public void setEpicFruit(int epicFruit) {
        this.epicFruit = epicFruit;
    }

    public int getAkuFruit() {
        return akuFruit;
    }

    public void setAkuFruit(int akuFruit) {
        this.akuFruit = akuFruit;
    }

    public int getElderFruit() {
        return elderFruit;
    }

    public void setElderFruit(int elderFruit) {
        this.elderFruit = elderFruit;
    }

    public int getGoldFruit() {
        return goldFruit;
    }

    public void setGoldFruit(int goldFruit) {
        this.goldFruit = goldFruit;
    }

    public int getPurpleBehemothStone() {
        return purpleBehemothStone;
    }

    public void setPurpleBehemothStone(int purpleBehemothStone) {
        this.purpleBehemothStone = purpleBehemothStone;
    }

    public int getRedBehemothStone() {
        return redBehemothStone;
    }

    public void setRedBehemothStone(int redBehemothStone) {
        this.redBehemothStone = redBehemothStone;
    }

    public int getBlueBehemothStone() {
        return blueBehemothStone;
    }

    public void setBlueBehemothStone(int blueBehemothStone) {
        this.blueBehemothStone = blueBehemothStone;
    }

    public int getGreenBehemothStone() {
        return greenBehemothStone;
    }

    public void setGreenBehemothStone(int greenBehemothStone) {
        this.greenBehemothStone = greenBehemothStone;
    }

    public int getYellowBehemothStone() {
        return yellowBehemothStone;
    }

    public void setYellowBehemothStone(int yellowBehemothStone) {
        this.yellowBehemothStone = yellowBehemothStone;
    }

    public int getEpicBehemothStone() {
        return epicBehemothStone;
    }

    public void setEpicBehemothStone(int epicBehemothStone) {
        this.epicBehemothStone = epicBehemothStone;
    }

    public int getPurpleBehemothGem() {
        return purpleBehemothGem;
    }

    public void setPurpleBehemothGem(int purpleBehemothGem) {
        this.purpleBehemothGem = purpleBehemothGem;
    }

    public int getRedBehemothGem() {
        return redBehemothGem;
    }

    public void setRedBehemothGem(int redBehemothGem) {
        this.redBehemothGem = redBehemothGem;
    }

    public int getBlueBehemothGem() {
        return blueBehemothGem;
    }

    public void setBlueBehemothGem(int blueBehemothGem) {
        this.blueBehemothGem = blueBehemothGem;
    }

    public int getGreenBehemothGem() {
        return greenBehemothGem;
    }

    public void setGreenBehemothGem(int greenBehemothGem) {
        this.greenBehemothGem = greenBehemothGem;
    }

    public int getYellowBehemothGem() {
        return yellowBehemothGem;
    }

    public void setYellowBehemothGem(int yellowBehemothGem) {
        this.yellowBehemothGem = yellowBehemothGem;
    }
}


