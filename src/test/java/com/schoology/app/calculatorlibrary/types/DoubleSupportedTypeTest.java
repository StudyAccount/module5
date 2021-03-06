package com.schoology.app.calculatorlibrary.types;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by User on 23.08.2016.
 */

@RunWith(value = Parameterized.class)
public class DoubleSupportedTypeTest {

    private static String inputString;
    private static boolean expectation;
    private static final DoubleSupportedType doubleType = new DoubleSupportedType();

    public DoubleSupportedTypeTest(String inputString, boolean expectation) {

        this.inputString = inputString;
        this.expectation = expectation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        String a = "3.14159265358979323846";
        String b = "-3.5";
        String c = "ddddd";
        String d = "2222222";
        return Arrays.asList(new Object[][]{
                {a, true},
                {b, true},
                {c, false},
                {d, true},
        });

    }

    @Test
    public void testCheckForTypeSupport() throws Exception {

        final boolean result = doubleType.checkType(inputString);

        Assert.assertArrayEquals("Current: ", new boolean[]{expectation}, new boolean[]{result});

    }
}