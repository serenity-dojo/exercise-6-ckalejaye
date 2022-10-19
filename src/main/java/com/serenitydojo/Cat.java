package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteToy;
    private int age;

    public static final String CAT_GAME = "plays with string";

    public Cat(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

//    @Override
    public String play() {
        return CAT_GAME;
    }
}
