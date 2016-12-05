package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackJack extends JPanel {
    JButton reset, drawCard;
    JPanel user, house;
    JLabel resetLabel, drawCardLabel, userLabel, houseLabel;

    public BlackJack(Deck deck, Player playerHouse, Player playerUser){
        reset = new JButton();
        drawCard = new JButton();
        user = new JPanel();
        house = new JPanel();
        resetLabel = new JLabel();
        drawCardLabel = new JLabel();
        userLabel = new JLabel();
        houseLabel = new JLabel();
        deck = new Deck();
        playerHouse = new Player();
        playerUser = new Player();

        drawCardLabel.setText("Draw a Card");
        drawCardLabel.setSize(20,20);
        resetLabel.setText("New Game");
        resetLabel.setSize(20,20);
        userLabel.setText("User played: ");
        houseLabel.setText("House played: ");

        drawCard.addActionListener(
                new drawCardButtonActionListener()
        );

        this.setSize(300,300);
        this.add(reset);
        this.add(drawCard);
        this.add(user);
        this.add(house);

        reset.add(resetLabel);
        drawCard.add(drawCardLabel);
        user.add(userLabel);
        house.add(houseLabel);
    }

    public void updateUserLabel(Player playerUser, Deck deck){
        playerUser.add(playerUser.played, deck.cards.get(deck.cards.size()) );
        userLabel.setText("");

    }

    private class drawCardButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            updateUserLabel();
        }
    }
}
