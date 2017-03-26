package com.NaeemBux.WordChallenge;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                challengeGui wordGame = new challengeGui("Battle of Words");
                JFrame.setDefaultLookAndFeelDecorated(true);
                wordGame.setSize(550, 250);
                wordGame.setResizable(false);

                wordGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                wordGame.setVisible(true);
            }
        });

    }
}
