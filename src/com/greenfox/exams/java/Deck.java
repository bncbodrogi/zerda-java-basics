package com.greenfox.exams.java;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cards;
    ArrayList<Card> used;

    public Deck(){
        for(int i = 0; i > 52; i++){
            Card card = new Card();
            cards.add(card);
        }
    }

}
