package com.NaeemBux.WordChallenge;

import java.util.HashMap;
import java.util.Map;

public class WordGenerator implements GeneratorInterface{

    private Map wordMap = new HashMap();

    public WordGenerator()
    {

    }


    public void generate(int difficulty){

        if (difficulty == 1) {
            wordMap = new HashMap();

            wordMap.put("easyWord", "Hint");

        }
        else if(difficulty == 2) {
            wordMap = new HashMap();

            wordMap.put("Key1", "element 1");

        }
        else if(difficulty == 3) {
            wordMap = new HashMap();

            wordMap.put("Key1", "element 1");
        }
    }

    public Map getWords()
    {
        return wordMap;
    }




}