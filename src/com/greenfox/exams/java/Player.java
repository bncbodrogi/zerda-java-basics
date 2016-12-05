package com.greenfox.exams.java;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Card> played;

    public int sum(ArrayList<Card> played){
        int sum = 0;
        for(Card card : played){
            sum = sum + card.value;
        }
        return sum;
    }

    public void add(ArrayList<Card> played, Card card){
        played.add(card);
    }
}
