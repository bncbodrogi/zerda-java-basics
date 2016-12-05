package com.greenfox.exams.java;

import java.util.Random;

public class Card {

    int value;
    String color;

    public Card (){
        Random randomNum = new Random();
        value = randomNum.nextInt(14) + 1;
        int colorPicker = randomNum.nextInt(4);
        if(colorPicker == 0){
            color = "Kor";
        }else if(colorPicker == 1){
            color = "Karo";
        }else if(colorPicker == 2){
            color = "Pikk";
        }else if(colorPicker == 3){
            color = "Treff";
        }
    }
}
