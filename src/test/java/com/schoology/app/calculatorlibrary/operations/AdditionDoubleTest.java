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
public class AdditionDoubleTest {

    private static List<String> inputData;
    private static String expectation;
    private static final AdditionDouble additionDouble = new AdditionDouble();

    public AdditionDoubleTest(List<String> inputData, String expectation) {
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
        b.add("0");
        List<String> c = new ArrayList<>();
        c.add("1.7976931348623157E308");
        c.add("-1.7976931348623157E308");
        List<String> d = new ArrayList<>();
        d.add("3.14159265358979733846");
        d.add("-3.14159265358979733846");
        return Arrays.asList(new Object[][]{
                {a, "2.8"},
                {b, "-2.6"},
                {c, "0"},
                {d, "0E-16"},
        });
    }

    @Test
    public void counter() throws Exception {

        final String actual = additionDouble.count(inputData);
        Assert.assertEquals("test results", expectation, actual);

    }
}