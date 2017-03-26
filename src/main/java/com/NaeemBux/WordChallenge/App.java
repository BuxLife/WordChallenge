package com.NaeemBux.WordChallenge;

import javax.swing.*;

/**
 * Developed by Naeem Bux
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                ChallengeGui wordGame = new ChallengeGui("Battle of Words");
                JFrame.setDefaultLookAndFeelDecorated(true);
                wordGame.setSize(550, 250);
                wordGame.setResizable(false);

                wordGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                wordGame.setVisible(true);
            }
        });

    }
}
