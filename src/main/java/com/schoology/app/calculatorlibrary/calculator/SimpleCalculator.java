package com.schoology.app.calculatorlibrary.calculator;

import com.schoology.app.calculatorlibrary.factory.CalculatorOperationFactory;
import com.schoology.app.calculatorlibrary.operations.Operation;
import com.schoology.app.calculatorlibrary.parser.Parser;
import com.schoology.app.calculatorlibrary.types.DoubleType;
import com.schoology.app.calculatorlibrary.types.LongType;
import com.schoology.app.calculatorlibrary.types.TypeSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.10.2016.
 */
public class SimpleCalculator implements Calculator {

    @Override
    public int checkType(List<String> operands) {
        TypeSupport doubleType = new DoubleType();
        TypeSupport longType = new LongType();
        boolean longCode = true;
        boolean doubleCode = true;

        for (String operand:operands) {

            if (longType.checkForTypeSupport(operand) == false){

                longCode = false;
            }

            if (doubleType.checkForTypeSupport(operand) == false){

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
    public int checkOperation(List<String> operation) {

        if ("+".equals(operation.get(0))){

            return 1;
        } else if ("-".equals(operation.get(0))){

            return 2;
        } else {

            return 0;
        }

    }

    @Override
    public String calculate(String input) {

        List<String> operation = new ArrayList<>();
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
