package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testCatGetSoundShouldReturnValue() {
        cat.getSound();
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCatGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        cat.getFood();
        List<String> expectedResult = feline.getFood("Хищник");
        List<String> actualResult =  cat.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }
}