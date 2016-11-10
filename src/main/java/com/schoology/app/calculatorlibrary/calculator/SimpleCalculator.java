package com.schoology.app.calculatorlibrary.calculator;

import com.schoology.app.calculatorlibrary.factory.CalculatorOperationFactory;
import com.schoology.app.calculatorlibrary.operations.Operation;
import com.schoology.app.calculatorlibrary.parser.Parser;
import com.schoology.app.calculatorlibrary.types.DoubleSupportedType;
import com.schoology.app.calculatorlibrary.types.LongSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.10.2016.
 */
public class SimpleCalculator implements Calculator {

    @Override
    public int checkType(List<String> operands) {
        SupportedType doubleSupportedType = new DoubleSupportedType();
        SupportedType longSupportedType = new LongSupportedType();
        boolean longCode = true;
        boolean doubleCode = true;

        for (String operand:operands) {

            if (longSupportedType.checkType(operand) == false){

                longCode = false;
            }

            if (doubleSupportedType.checkType(operand) == false){

                doubleCode = false;
            }
        }

        if (longCode == true ){

            return 1;
        }else if(doubleCode == true){

            return 2;
        }else {

            return 0;
        }
    }

    @Override
    public int checkOperation(String operation) {

        if ("+".equals(operation)){

            return 1;
        } else if ("-".equals(operation)){

            return 2;
        } else {

            return 0;
        }

    }

    @Override
    public String calculate(String input) {

        String operation = null;
        List<String> operands = new ArrayList<>();
        CalculatorOperationFactory calculatorOperationFactory = new CalculatorOperationFactory();
        Parser parser = new Parser(operation, operands);
        Operation currentOperation;

        parser.parser(input);

        int typeOfOperationCode = checkType(parser.getOperands());
        int operationCode = checkOperation(parser.getOperation());

        if (typeOfOperationCode == 1) {

            if (operationCode == 1){

                currentOperation = calculatorOperationFactory.getOperationInstance(1);
            }else if (operationCode == 2){

                currentOperation = calculatorOperationFactory.getOperationInstance(3);
            }else return "Not supported operation";
        } else if (typeOfOperationCode == 2) {

            if (operationCode == 1){

                currentOperation = calculatorOperationFactory.getOperationInstance(0);
            }else if (operationCode == 2){

                currentOperation = calculatorOperationFactory.getOperationInstance(2);
            }else return "Not supported operation";
        }else return "Not supported type";

        String result = currentOperation.count(parser.getOperands());

        return result;
    }
}
