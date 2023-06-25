package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedWithExceptionTest {
    private final String sex;
    private final boolean expectedResult;

    public LionParametrizedWithExceptionTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Проверка исключения. Тестовые данные: {0}")
    public static Object[][] getLionParams() {
        return new Object[][]{
                {"Детеныш", true},
        };
    }




    @Test
    public void testLionDoesHaveManeShouldThrowException() throws Exception {
        Throwable thrown = catchThrowable(() -> {
            Lion lion = new Lion(sex);
            assertEquals(expectedResult, lion.doesHaveMane());
        });
        assertThat(thrown).isInstanceOf(Exception.class);
        assertThat(thrown.getMessage()).isNotBlank();
    }
}