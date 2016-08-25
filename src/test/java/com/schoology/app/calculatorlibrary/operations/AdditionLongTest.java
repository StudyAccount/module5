package com.schoology.app.calculatorlibrary.operations;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by SleepWalker on 25.08.2016.
 */
@RunWith(value = Parameterized.class)
public class AdditionLongTest {

    private static List<String> inputData;
    private static String expectation;
    private static final AdditionLong additionLong = new AdditionLong();

    public AdditionLongTest(List<String> inputData, String expectation) {
        this.inputData = inputData;
        this.expectation = expectation;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        List<String> a = new ArrayList<>();
        a.add("7976931348623157");
        a.add("7976931348623157");
        List<String> b = new ArrayList<>();
        b.add("7976931348623157");
        b.add("-7976931348623159");
        List<String> c = new ArrayList<>();
        c.add("9223372036854775807");
        c.add("9223372036854775807");
        List<String> d = new ArrayList<>();
        d.add("-3");
        d.add("-3");
        return Arrays.asList(new Object[][]{
                {a, "15953862697246314"},
                {b, "-2"},
                {c, "18446744073709551614"},
                {d, "-6"},
        });
    }


    @Test
    public void counter() throws Exception {

        final String actual = additionLong.counter(inputData);
        Assert.assertEquals("test results", expectation, actual);

    }
}