package com.schoology.app.calculatorlibrary.operations;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by SleepWalker on 25.08.2016.
 */
public class AdditionLong implements Addition{

    @Override
    public String count(List<String> inputData) {

        BigInteger result = BigInteger.ZERO;

        for(String element:inputData){
            Long termLong = Long.parseLong(element);
            BigInteger termBigInteger = BigInteger.valueOf(termLong);
            result = result.add(termBigInteger);
        }

        return result.toString();
    }
}
