package com.schoology.app.calculatorlibrary.calculator;

import com.schoology.app.calculatorlibrary.operations.*;
import com.schoology.app.calculatorlibrary.provider.SimpleOperationProvider;
import com.schoology.app.calculatorlibrary.types.DoubleSupportedType;
import com.schoology.app.calculatorlibrary.types.LongSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by User on 05.10.2016.
 */

@RunWith(value = Parameterized.class)
public class SimpleCalculatorTest {

    private  List<SupportedType> supportedTypesList = new ArrayList<>();
    private  List<Operation> supportedOperations = new ArrayList<>();
    private static final SimpleCalculator simpleCalculator = new SimpleCalculator();
    private static String  inputData;
    private static String expectation;


    public SimpleCalculatorTest(String inputData, String expectation) {
        this.inputData = inputData;
        this.expectation = expectation;
    }
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//
//        supportedTypesList.add(new LongSupportedType());
//        supportedTypesList.add(new DoubleSupportedType());
//
//        supportedOperations.add(new AdditionLong());
//        supportedOperations.add(new AdditionDouble());
//        supportedOperations.add(new SubtractionLong());
//        supportedOperations.add(new SubtractionDouble());
//
//    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        String a = "*,3,2";
        String b = "-,2,2";
        String c = "+,2D,2.2";
        String d = "+,qwe,asd";
        return Arrays.asList(new Object[][]{
                {a, ""},
                {b, ""},
                {c, ""},
                {d, ""},
        });

    }

    @Test
    public void testCalculate() throws Exception {

        supportedTypesList.add(new LongSupportedType());
        supportedTypesList.add(new DoubleSupportedType());

        supportedOperations.add(new AdditionLong());
        supportedOperations.add(new AdditionDouble());
        supportedOperations.add(new SubtractionLong());
        supportedOperations.add(new SubtractionDouble());

       final String result = simpleCalculator.calculate(inputData);
        Assert.assertEquals("s", new String[]{expectation},  new String[]{result});


    }

}