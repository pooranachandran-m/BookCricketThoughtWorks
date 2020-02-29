package com.tw.banking;

public class ScoreBoard {
    int batsManScore;
    int bowlerScore;
    int chaseTarget;
    boolean isMatchFinished;

    boolean sameKnockRun = false;

    public ScoreBoard(int chaseTarget) {
        this.chaseTarget = chaseTarget;
    }

    public void updateScore(int ball, Player batsMan,Player bowler) {

        if(bowler.getBowlingStyle() == BowlerType.PART_TIME){

        } else if(batsMan.getLastBallScore() == bowler.getLastBallScore()){
            isMatchFinished =true;
        }else{
            this.batsManScore = + batsMan.getLastBallScore();
            this.bowlerScore = + bowler.getLastBallScore();
        }


    }

    public void displayResult() {
        if (sameKnockRun) {
            System.out.println("Batsman has lost");
        }
        if (batsManScore > chaseTarget) {
            System.out.println("Batsman has won");
        } else {
            System.out.println("Batsman has lost");
        }
    }

    public boolean isMatchFinished(){
        return this.isMatchFinished;
    }
}
