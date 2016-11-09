package com.schoology.app.calculatorlibrary.operations;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by SleepWalker on 25.08.2016.
 */
public class SubtractionLong implements Subtraction {

    @Override
    public String count(List<String> inputData) {

        Long firstLong = Long.parseLong(inputData.get(0));
        Long secondLong = Long.parseLong(inputData.get(1));

        BigInteger firstInteger = BigInteger.valueOf(firstLong);
        BigInteger secondInteger = BigInteger.valueOf(secondLong);

        BigInteger result =firstInteger.subtract(secondInteger);
        return result.toString();
    }
}
