package com.NaeemBux.WordChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class challengeGui extends JFrame implements ActionListener
{

    /*TextFields*/
    private JTextField wordTxt = new JTextField(30);
    private JTextArea helpTxt = new JTextArea(8, 30);

    /*Panels*/
    private JPanel textPanel = new JPanel();
    private JPanel controlPanel = new JPanel();

    /*Buttons*/
    private JButton newGameBtn = new JButton("New Game");
    private JButton hintBtn = new JButton("Hint?");
    private JButton difficultyBtn = new JButton("Change Difficulty");
    private JButton helpBtn = new JButton("Help");
    private JButton scoreBtn = new JButton("High Scores");
    private JButton exitBtn = new JButton("Exit");
    private JButton resetBtn = new JButton("Reset Game");

    /*Labels*/
    private JLabel difficultyLbl = new JLabel("Difficulty:      Normal");


    public challengeGui(String title){

        super(title);

        /*Layout*/
        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.EAST);

        /*Control Panel*/
        controlPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        controlPanel.setLayout(new GridBagLayout());
        GridBagConstraints cpc = new GridBagConstraints();

        cpc.fill = GridBagConstraints.HORIZONTAL;
        cpc.weightx= 1;
        cpc.gridx = 0;
        cpc.gridy = 0;
        controlPanel.add(difficultyLbl);
        cpc.gridx = 0;
        cpc.gridy = 1;
        controlPanel.add(newGameBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 2;
        controlPanel.add(resetBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 3;
        controlPanel.add(difficultyBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 4;
        controlPanel.add(scoreBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 5;
        controlPanel.add(hintBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 6;
        controlPanel.add(helpBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 7;
        controlPanel.add(exitBtn, cpc);



        /*Text Panel*/
        textPanel.setBorder(BorderFactory.createTitledBorder("War of the Word"));
        textPanel.setLayout(new GridBagLayout());
        cpc.gridx = 0;
        cpc.gridy = 2;
        textPanel.add(wordTxt, cpc);
        cpc.gridx = 0;
        cpc.gridy = 1;
        textPanel.add(helpTxt);

        wordTxt.setEditable(false);


        /*ActionListeners*/
        newGameBtn.addActionListener(this);
        hintBtn.addActionListener(this);
        difficultyBtn.addActionListener(this);
        helpBtn.addActionListener(this);
        scoreBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        exitBtn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == exitBtn)
        {
            System.exit(0);
        }
    }
}