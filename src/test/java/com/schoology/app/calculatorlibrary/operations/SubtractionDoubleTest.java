package com.schoology.app.calculatorlibrary.operations;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by SleepWalker on 25.08.2016.
 */
@RunWith(value = Parameterized.class)
public class SubtractionDoubleTest {

    private static List<String> inputData;
    private static String expectation;
    private static final SubtractionDouble subtractionDouble = new SubtractionDouble();

    public SubtractionDoubleTest(List<String> inputData, String expectation) {
        this.inputData = inputData;
        this.expectation = expectation;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        List<String> a = new ArrayList<>();
        a.add("1.3D");
        a.add("1.5D");
        List<String> b = new ArrayList<>();
        b.add("-1.3");
        b.add("-1.3");
        List<String> c = new ArrayList<>();
        c.add("1.7976931348623157E308");
        c.add("-1.7976931348623157E308");
        List<String> d = new ArrayList<>();
        d.add("3.14159265358979373846");
        d.add("-3.141592653589793273846");
        return Arrays.asList(new Object[][]{
                {a, "-0.2"},
                {b, "0.0"},
                {c, "3.5953862697246314E+308"},
                {d, "6.2831853071795866"},
        });
    }


    @Test
    public void counter() throws Exception {

        final String actual = subtractionDouble.counter(inputData);
        Assert.assertEquals("test results", expectation, actual);

    }

}