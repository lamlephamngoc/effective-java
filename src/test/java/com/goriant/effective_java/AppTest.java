package com.goriant.effective_java;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
public class AppTest {

    @Mock
    private App app;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);


//        org.mockito.exceptions.misusing.UnnecessaryStubbingException:
//        Unnecessary stubbings detected.
//                Clean & maintainable test code requires zero unnecessary code.
//        Following stubbings are unnecessary (click to navigate to relevant line of code):
//        1. -> at com.goriant.effective_java.AppTest.setup(AppTest.java:32)
//        Please remove unnecessary stubbings or use 'lenient' strictness. More info: javadoc for UnnecessaryStubbingException class.


//        when(app.add(anyInt(), anyInt())).thenReturn(5);
    }

    @Test
    void lambdaExpressions() {

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        assertTrue(numbers.stream()
                .mapToInt(i -> i)
                .sum() > 5, "Sum should be greater than 5");
    }

    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};

        assertAll("numbers",
                () -> assertEquals(numbers[1], 1),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    @Test
    void disabledTest() {
        assertTrue(true);
    }
}
