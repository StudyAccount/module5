package com.schoology.app.calculatorlibrary.types;

import com.schoology.app.calculatorlibrary.types.IntType;
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
public class IntTypeTest {

    private static String inputString;
    private static boolean expectation;
    public static final IntType intType = new IntType();

    public IntTypeTest(String inputString, boolean expectation) {

        this.inputString = inputString;
        this.expectation = expectation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        String a = "3.1";
        String b = "9223372036854775807";
        String c = "string";
        String d = "-2222222";
        return Arrays.asList(new Object[][]{
                {a, false},
                {b, false},
                {c, false},
                {d, true},
        });

    }

    @Test
    public void testCheckForTypeSupport() throws Exception {
        final boolean result = intType.checkForTypeSupport(inputString);
        Assert.assertArrayEquals("Currrent: ", new boolean[]{expectation}, new boolean[]{result});

    }
}