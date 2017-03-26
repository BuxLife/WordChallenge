package com.NaeemBux.WordChallenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/26.
 */
public class WordChallengeTest {
    private int difficulty;

    @Before
    public void setUp() throws Exception {
        difficulty = 1;
    }

    @Test
    public void generate() throws Exception {
        WordChallenge wc = new WordChallenge();
        wc.generate(difficulty);
    }

    @Test
    public void loadPlayers() throws Exception {
        WordChallenge wc = new WordChallenge();
        wc.loadPlayers();
    }

}