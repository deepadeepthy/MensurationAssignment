package com.probability.test;

import com.probability.CoinToss;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossTest {

    private final double GETTING_HEAD= 0.5;
    private final double GETTING_TAIL= 0.5;

    @Test
    void probOfGettingHeadIsEqualToGettingTail(){
        CoinToss coinOneToss=new CoinToss(GETTING_HEAD);
        CoinToss coinTwoToss=new CoinToss(GETTING_TAIL);
        assertTrue(coinOneToss.equals(coinTwoToss));
    }

    @Test
    void probOfAnEventNotOccuring(){
        CoinToss coinOneToss=new CoinToss(GETTING_HEAD);

        //assertEquals();
    }
}
