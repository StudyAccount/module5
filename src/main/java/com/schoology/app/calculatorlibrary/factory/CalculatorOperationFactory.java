package com.schoology.app.calculatorlibrary.factory;

import com.schoology.app.calculatorlibrary.operations.*;

/**
 * Created by User on 30.08.2016.
 */
public class CalculatorOperationFactory implements OperationFactory {

    private Operation operation;

    @Override
    public Operation getOperationInstance(int operationCode) {

        switch (operationCode){

            case 0:{
                operation = new AdditionDouble();
                break;
            }
            case 1:{
                operation = new AdditionLong();
                break;
            }
            case 2:{
                operation = new SubtractionDouble();
                break;
            }
            case 3:{
                operation = new SubtractionLong();
                break;
            }
            default:{
                operation = null;
            }

        }
        return operation;
    }
}
