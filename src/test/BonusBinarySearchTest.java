package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.BonusBinarySearch;

public class BonusBinarySearchTest {
    int[] emptyArray = {};
    int[] array1 = {2};
    int[] array2 = {0,1,2,3,4,9};

    @Test
    public void emptyTest1(){
        Assert.assertEquals(BonusBinarySearch.binarySearch(emptyArray,5),-1);
    }

    @Test
    public void array1Test1(){
        Assert.assertEquals(BonusBinarySearch.binarySearch(array1,2),0);
    }

    @Test
    public void array1Test2(){
        Assert.assertEquals(BonusBinarySearch.binarySearch(array1,3),-1);
    }

    @Test
    public void array2Test1(){
        Assert.assertEquals(BonusBinarySearch.binarySearch(array2,3),3);
    }

    @Test
    public void array2Test2(){
        Assert.assertEquals(BonusBinarySearch.binarySearch(array2,7),-1);
    }




}
