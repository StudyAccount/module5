package com.schoology.app.calculatorlibrary.calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 05.10.2016.
 */
public class SimpleCalculatorTest {

    private static List<String> inputData = new ArrayList<>();
    private static int expected;
    private static SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    public void testCheckType() throws Exception {

        inputData.add("12");
        inputData.add("a");
//        simpleCalculator.checkType(inputData);


    }

//    @Test
//    public void testCheckOperation() throws Exception {
//
//    }
//
//    @Test
//    public void testCalculate() throws Exception {
//
//    }
}