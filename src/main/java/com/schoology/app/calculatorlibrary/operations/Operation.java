package com.schoology.app.calculatorlibrary.operations;

import java.util.List;

/**
 * Created by User on 23.08.2016.
 */
public interface Operation {

    String getOperationSymbol();

    String count(List<String> inputData);

    String getTypeOfOperands();

}
