package com.schoology.app.calculatorlibrary.operations;

import com.schoology.app.calculatorlibrary.types.DoubleSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by User on 23.08.2016.
 */
public class AdditionDouble implements Addition {

    @Override
    public String count(List<String> inputData) {

        BigDecimal result = BigDecimal.ZERO;
        SupportedType supportedType = new DoubleSupportedType();

        for(String element:inputData){

            if (supportedType.checkType(element) == true) {
                double termDouble = Double.parseDouble(element);

                BigDecimal termBigDecimal = BigDecimal.valueOf(termDouble);
                result = result.add(termBigDecimal);
            }
        }

        return result.toString();
    }
}
