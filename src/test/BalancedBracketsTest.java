package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void correctBrackets(){
        BalancedBrackets trueBrackets = new BalancedBrackets();
        assertEquals(true, trueBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void incorrectBrackets(){
        BalancedBrackets falseBrackets = new BalancedBrackets();
        assertEquals(false, falseBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void weightedOpenBrackets(){
        BalancedBrackets weighted = new BalancedBrackets();
        assertEquals(false, weighted.hasBalancedBrackets("[[]"));
    }

    @Test
    public void weightedClosedBrackets(){
        BalancedBrackets weightedclose = new BalancedBrackets();
        assertEquals(false, weightedclose.hasBalancedBrackets("[]]"));
    }

    @Test
    public void invertedBracket(){
        BalancedBrackets invertBrackets = new BalancedBrackets();
        assertEquals(false, invertBrackets.hasBalancedBrackets("]["));


    }

    @Test
    public void emptyString() {
        BalancedBrackets empty = new BalancedBrackets();
        assertEquals(true, empty.hasBalancedBrackets(" "));
    }

    @Test
    public void characterString() {
        BalancedBrackets charString = new BalancedBrackets();
        assertEquals(true, charString.hasBalancedBrackets("[Hey it's me ur brother]"));
    }

    @Test
    public void concatString() {
        BalancedBrackets concatString = new BalancedBrackets();
        assertEquals(true, concatString.hasBalancedBrackets("[Hey it's me ur brother" + "]"));
    }


}
