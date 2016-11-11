package com.schoology.app.calculatorlibrary.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by User on 05.10.2016.
 */

@RunWith(value = Parameterized.class)
public class SimpleCalculatorTest {

    private static final SimpleCalculator simpleCalculator = new SimpleCalculator();
    private static String  inputData;
    private static String expectation;


    public SimpleCalculatorTest(String inputData, String expectation) {
        this.inputData = inputData;
        this.expectation = expectation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        String a = "*,3,2";
        String b = "-,2,2";
        String c = "+,2D,2.2";
        String d = "+,qwe,asd";
        return Arrays.asList(new Object[][]{
                {a, "Current operation is not supported"},
                {b, "0.0"},
                {c, "4.2"},
                {d, "Current types are not supported"},
        });
    }

    @Test
    public void testCalculate() throws Exception {

        simpleCalculator.init();
        final String result = simpleCalculator.calculate(inputData);
        Assert.assertArrayEquals(new String[]{expectation},  new String[]{result});
    }

}