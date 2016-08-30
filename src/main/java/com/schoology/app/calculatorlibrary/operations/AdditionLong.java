package com.schoology.app.calculatorlibrary.operations;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by SleepWalker on 25.08.2016.
 */
public class AdditionLong implements Operation{

    @Override
    public String counter(List<String> inputData) {

        Long firstLong = Long.parseLong(inputData.get(0));
        Long secondLong = Long.parseLong(inputData.get(1));

        BigInteger firstInteger = BigInteger.valueOf(firstLong);
        BigInteger secondInteger = BigInteger.valueOf(secondLong);

        BigInteger result =firstInteger.add(secondInteger);
        return result.toString();
    }
}
