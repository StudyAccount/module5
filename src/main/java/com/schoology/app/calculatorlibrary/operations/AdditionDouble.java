package com.schoology.app.calculatorlibrary.operations;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by User on 23.08.2016.
 */
public class AdditionDouble implements Operation {


    @Override
    public String counter(List<String> inputData) {

        double firstDouble = Double.parseDouble(inputData.get(0));
        double secondDouble = Double.parseDouble(inputData.get(1));

        BigDecimal firstDecimal = BigDecimal.valueOf(firstDouble);
        BigDecimal secondDecimal = BigDecimal.valueOf(secondDouble);

        BigDecimal result = firstDecimal.add(secondDecimal);

        return result.toString();
    }
}
