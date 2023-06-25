package com.example;

import org.junit.Assert;
import org.junit.Test;

public class GetKittensTest {
    Feline feline = new Feline();
    @Test
    public void testGetKittensShouldReturnValue() {
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
