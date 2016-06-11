package com.zipcode21;

/**
 * Created by tyrellhoxter on 6/11/16.
 */
public abstract class CardGame extends Game {

    private Dealer dealer;
    private Deck deck;

    public CardGame(Player player){
        super(player);

    }

    public String dealCards(){
       return dealer.deal();
    }
}
