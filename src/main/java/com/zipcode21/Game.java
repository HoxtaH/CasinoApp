package com.zipcode21;

/**
 * Created by tyrellhoxter on 6/11/16.
 */
public abstract class Game {

    private Player player;

    public Game(Player player){
        this.player = player;
    }

    abstract public void play();


}
