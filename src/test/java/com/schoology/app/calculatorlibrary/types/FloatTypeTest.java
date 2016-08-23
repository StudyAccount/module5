package com.schoology.app.calculatorlibrary.types;

import com.schoology.app.calculatorlibrary.types.FloatType;
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
public class FloatTypeTest {

    private static String inputString;
    private static boolean expectation;
    public static final FloatType floatType = new FloatType();

    public FloatTypeTest(String inputString, boolean expectation) {

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

        final boolean result = floatType.checkForTypeSupport(inputString);
        Assert.assertArrayEquals("Currrent: ", new boolean[]{expectation}, new boolean[]{result});

    }
}