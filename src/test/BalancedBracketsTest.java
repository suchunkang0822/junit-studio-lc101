package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import main.BalancedBrackets;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test
    public void noBracketTest(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("abcdefg"));
    }

    @Test
    public void leftBracketTest(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void leftBracketWithStringTest1(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("asdf[fdfd"));
    }

    @Test
    public void leftBracketWithStringTest2(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("asdf["));
    }

    @Test
    public void leftBracketWithStringTest3(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("[asdfdsf"));
    }

    @Test
    public void rightBracketTest(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void rightBracketWithStringTest1(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("asdf]fdfd"));
    }

    @Test
    public void rightBracketWithStringTest2(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("asdf]"));
    }

    @Test
    public void rightBracketWithStringTest3(){
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("]asddf"));
    }

    @Test
    public void leftRightBracketTest1(){
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void leftRightBracketTest2(){
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("sdfsadf[]"));
    }

    @Test
    public void leftRightBracketTest3(){
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("[sadfdsf]"));
    }

    @Test
    public void leftRightBracketTest4(){
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("[]asdfsdf"));
    }

    @Test
    public void leftRightBracketTest5(){
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("adfaf[asdfdsf]asdfsdf"));
    }







}
