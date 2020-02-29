package com.tw.banking;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class PlayerTest {
    @Test
    void testHitManRunWithinLimits() {

        Player batsMan=new Player(BatsManType.HITTER,BowlerType.NO);
        Player bowler=new Player(BatsManType.NO,BowlerType.NORMAL);
        assertThat(batsMan.bat(), CoreMatchers.anyOf(is(0),is(4),is(6)));
    }
}