package com.inferno.game;

public class Dante extends DynamicGameObject{
    
    public static final float DANTE_WIDTH = 0.8f;
	public static final float DANTE_HEIGHT = 0.8f;
    public static float Elixer = 100;
    public static float Mod = 1;

    public Dante(float x, float y){
        super(x,y, DANTE_WIDTH, DANTE_HEIGHT);
    }

    public float getElixer(){
        return Elixer;
    }

    public float getMod(){
        return Mod;
    }
}
