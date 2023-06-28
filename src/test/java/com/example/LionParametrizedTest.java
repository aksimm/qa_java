package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean expectedResult;

    public LionParametrizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters(name = "Проверка гривы. Тестовые данные: {0}, {1}")
    public static Object[][] getLionParams() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void testLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(expectedResult, lion.doesHaveMane());
    }
}
