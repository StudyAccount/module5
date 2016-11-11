package com.schoology.app.calculatorlibrary.operations;

import com.schoology.app.calculatorlibrary.types.LongSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by SleepWalker on 25.08.2016.
 */
public class SubtractionLong implements Subtraction {

    @Override
    public String count(List<String> inputData) {

        BigInteger result = BigInteger.ZERO;
        SupportedType supportedType = new LongSupportedType();

        if (inputData.size() >= 1 && supportedType.checkType(inputData.get(0)) == true){
            Long firstElement = Long.parseLong(inputData.get(0));
            result = BigInteger.valueOf(firstElement);
            inputData.remove(0);
        }

        for(String element : inputData){
            if (supportedType.checkType(element) == true) {
                Long termLong = Long.parseLong(element);
                BigInteger termBigInteger = BigInteger.valueOf(termLong);
                result = result.subtract(termBigInteger);
            }
        }

        return result.toString();
    }

    @Override
    public String getTypeOfOperands() {
        return "long";
    }
}
