package com.schoology.app.calculatorlibrary.operations;

/**
 * Created by User on 09.11.2016.
 */
public interface Subtraction extends Operation {

    @Override
    default String getOperationSymbol(){
        return "-";
    }
}
