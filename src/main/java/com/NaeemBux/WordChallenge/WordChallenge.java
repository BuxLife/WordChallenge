package com.NaeemBux.WordChallenge;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Bux_Life on 2017/03/26.
 */
class Player {

    private int score;
    private int attempts;
    private String name;

    @Setter
    public void setScore(int sc) {
        score = sc;
    }
    @Setter
    public void setAttempts(int at) {
        attempts = at;
    }
    @Setter
    public void setName(String nm) {
        name = nm;
    }
    @Getter
    public int getScore() {
        return score;
    }
    @Getter
    public int getAttempts() {
        return attempts;
    }
    @Getter
    public String getName() {
        return name;
    }

    public Player()
    {
        name = "";
        score = 0;
        attempts = 3;
    }
    public Player(int sc, int att, String nme)
    {
        setName(nme);
        setScore(sc);
        setAttempts(att);
    }
}

public class WordChallenge implements GeneratorInterface{


    private Player finn_TheHuman = new Player();
    ArrayList<Player> playerList = new ArrayList<Player>();
    Collection<Player> topScorers = new ArrayList<Player>();

     /*Generate ScoreBoard with default scores. new scores will not be saved when app closes.*/
    public void generate(int difficulty) {
        for (int i = 0; i < playerList.size(); i++)
        {
            if (playerList.get(i).getScore() > 10 )
            {
                topScorers.add(playerList.get(i));
            }

        }
    }
    public void loadPlayers()
    {
        playerList.add(new Player(10, 0, "JDee"));
        playerList.add(new Player(5, 0, "Mick"));
        playerList.add(new Player(15, 0, "Lion"));
        playerList.add(new Player(9, 0, "King"));
        playerList.add(new Player(7, 0, "Star"));
        playerList.add(new Player(12, 0, "Fox"));
    }

    public int newGame()
    {

        return 0;
    }
}
