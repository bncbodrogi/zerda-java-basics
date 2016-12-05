package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;

public class App {
        public static void main(String[] args) {
            BlackJack blackJack = new BlackJack(new Deck(), new Player(), new Player());
            JFrame frame = new JFrame();

            frame.add(blackJack);
            frame.setVisible(true);

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();

            int posx = (dim.width / 2) - (frame.getWidth());
            int posy = (dim.height / 2) - (frame.getHeight());

            frame.setSize(500,300);
            frame.setLocation(posx, posy);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }
}
