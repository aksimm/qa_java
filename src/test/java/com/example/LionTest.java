package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline = new Feline();
    Lion lion = new Lion(feline);

    @Test
    public void testLionGetKittensShouldReturnValidValue() {
        lion.getKittens();
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLionGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        lion.getFood();
        List<String> expectedResult = feline.getFood("Хищник");
        List<String> actualResult =  lion.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
