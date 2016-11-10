package com.schoology.app.calculatorlibrary.operations;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by User on 23.08.2016.
 */
public class AdditionDouble implements Addition {

    @Override
    public String count(List<String> inputData) {

        BigDecimal result = BigDecimal.ZERO;

        for(String element:inputData){
            double termDouble = Double.parseDouble(element);
            BigDecimal termBigDecimal = BigDecimal.valueOf(termDouble);
            result = result.add(termBigDecimal);
        }

        return result.toString();
    }
}
