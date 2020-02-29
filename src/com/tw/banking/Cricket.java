package com.tw.banking;

public class Cricket {
    Player batsMan;
    Player bowler;
    ScoreBoard scoreBoard;

    public Cricket(Player batsMan, Player bowler, int chaseTarget) {
        this.batsMan = batsMan;
        this.bowler = bowler;
        scoreBoard=new ScoreBoard(chaseTarget);
    }

    public void startGame( int overs){
        int balls=overs*6;
        for(int i=0;i< balls;i++){
            if(!scoreBoard.isMatchFinished){
                batsMan.bat();
                bowler.bowl();
                scoreBoard.updateScore(i+1,batsMan, bowler);
            }
        }
    }

    public void publishResult(){
        scoreBoard.displayResult();
    }
}
