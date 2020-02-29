package com.tw.banking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {
    private int lastBallScore=0;
    private BatsManType battingStyle;
    private BowlerType bowlingStyle;

    private List<Integer> feasibleBatsManScores;
    private List<Integer> feasibleBowlerScores;

    Player(BatsManType battingStyle,BowlerType bowlingStyle){
        this.battingStyle=battingStyle;
        this.bowlingStyle=bowlingStyle;
        feasibleBatsManScores=new ArrayList<>();
        feasibleBowlerScores=new ArrayList<>();

        switch (battingStyle){
            case NORMAL: {
                feasibleBatsManScores=Arrays.asList(0,1,2,3,4,5,6);
                break;
            }
            case HITTER: {
                feasibleBatsManScores=Arrays.asList(0,1,2,3);
                break;
            }
        }
        feasibleBowlerScores=Arrays.asList(0,1,2,3,4,5,6);
        }

    public void bat(){
        int index = new Random().nextInt(feasibleBatsManScores.size());
        lastBallScore  = feasibleBatsManScores.get(index);
    }

    public void bowl(){
        int index = new Random().nextInt(feasibleBowlerScores.size());
        lastBallScore  = feasibleBowlerScores.get(index);
    }

    public int getLastBallScore() {
        return lastBallScore;
    }

    public BatsManType getBattingStyle() {
        return battingStyle;
    }

    public BowlerType getBowlingStyle() {
        return bowlingStyle;
    }

}
