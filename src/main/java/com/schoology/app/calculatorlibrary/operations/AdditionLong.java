package com.schoology.app.calculatorlibrary.operations;

import com.schoology.app.calculatorlibrary.types.LongSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by SleepWalker on 25.08.2016.
 */
public class AdditionLong implements Addition{

    @Override
    public String count(List<String> inputData) {

        BigInteger result = BigInteger.ZERO;
        SupportedType supportedType = new LongSupportedType();

        for(String element:inputData){
            if (supportedType.checkType(element) == true) {
                Long termLong = Long.parseLong(element);
                BigInteger termBigInteger = BigInteger.valueOf(termLong);
                result = result.add(termBigInteger);
            }
        }

        return result.toString();
    }

    @Override
    public String getTypeOfOperands() {
        return "long";
    }
}
