package com.tw.banking;

import org.junit.Test;

class CricketTest {

    @Test
    public void whenCricketStartsItShouldReturnScoreBoard(){

        Player batsMan=new Player(BatsManType.HITTER,BowlerType.NO);
        Player bowler=new Player(BatsManType.NO,BowlerType.NORMAL);
        Cricket cricket=new Cricket(batsMan,bowler,20);
        cricket.startGame(20);
    }

}