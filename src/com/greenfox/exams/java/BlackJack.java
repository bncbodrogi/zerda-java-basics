package com.greenfox.exams.java;

import javax.swing.*;

public class BlackJack extends JPanel {
    JButton reset, drawCard;
    JPanel user, house, container;
    JLabel resetLabel, drawCardLabel, userLabel, houseLabel;

    public BlackJack(){
        container = new JPanel();
        reset = new JButton();
        drawCard = new JButton();
        user = new JPanel();
        house = new JPanel();
        resetLabel = new JLabel();
        drawCardLabel = new JLabel();
        userLabel = new JLabel();
        houseLabel = new JLabel();

        container.add(reset);
        container.add(drawCard);
        container.add(user);
        container.add(house);

        reset.add(resetLabel);
        drawCard.add(drawCardLabel);
        user.add(userLabel);
        house.add(houseLabel);


    }

}
