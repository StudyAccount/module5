package com.schoology.app.calculatorlibrary.operations;

import com.schoology.app.calculatorlibrary.types.DoubleSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by User on 23.08.2016.
 */
public class SubtractionDouble implements Subtraction {

    @Override
    public String count(List<String> inputData) {

        BigDecimal result = BigDecimal.ZERO;
        SupportedType supportedType = new DoubleSupportedType();

        if (inputData.size() > 0 && supportedType.checkType(inputData.get(0))== true){

            double firstElement = Double.parseDouble(inputData.get(0));
            result = BigDecimal.valueOf(firstElement);
            inputData.remove(0);
        }

        for(String element:inputData){
            if (supportedType.checkType(element) == true) {
                double termDouble = Double.parseDouble(element);
                BigDecimal termBigDecimal = BigDecimal.valueOf(termDouble);
                result = result.subtract(termBigDecimal);
            }
        }

        return result.toString() ;
    }
}
