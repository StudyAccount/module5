package com.schoology.app.calculatorlibrary.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.09.2016.
 */
public class ParserTest {

    private static List<String> expectedOperands;
    private static List<String> resultOperands;
    private static String expectedOperations;
    private static String resultOperations;
    Parser parser;
    private static String inputString;

    @Before
    public void setUp() throws Exception {

        parser = new Parser(resultOperations, resultOperands);
        inputString = "*,33,2";
        resultOperands = new ArrayList<>();
        expectedOperands = new ArrayList<>();
        expectedOperands.add("33");
        expectedOperands.add("2");
        expectedOperations ="*";
    }

    @Test
    public void testGetOperands() throws Exception {

        parser.parser(inputString);
        resultOperands = parser.getOperands();
        Assert.assertEquals(expectedOperands, resultOperands);
    }

    @Test
    public void testGetOperation() throws Exception {
        parser.parser(inputString);
        resultOperations = parser.getOperation();
        Assert.assertEquals(expectedOperations, resultOperations);

    }
}