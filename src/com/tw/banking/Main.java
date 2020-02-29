package com.tw.banking;

public class Main {

    public static void main(String[] args) {
        Player batsMan=new Player(BatsManType.HITTER,BowlerType.NO);
        Player bowler=new Player(BatsManType.NO,BowlerType.NORMAL);
        Cricket cricket=new Cricket(batsMan,bowler,20);
        cricket.startGame(20);

    }
}
