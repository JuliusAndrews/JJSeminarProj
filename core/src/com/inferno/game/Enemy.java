package com.inferno.game;

public class Enemy extends DynamicGameObject{

    public static float health = 5;

    public Enemy(float x, float y, float width, float height, float h) {
        super(x, y, width, height);
        health = h;
    }

    void hit(float damage)

}