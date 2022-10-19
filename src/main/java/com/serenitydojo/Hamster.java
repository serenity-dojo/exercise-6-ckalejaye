package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteGame;
    private int age;
    private String play;

    public static final String HAMSTER_GAME = "runs in wheel";
    public Hamster(String name, int age, String favoriteGame) {
        super(name);
        this.favoriteGame = favoriteGame;
        this.age = age;
    }

    public String getFavoriteGame(){
        return favoriteGame;
    }

    public int getAge(){
        return age;
    }

    public String play() {
        return HAMSTER_GAME;
    }
}
