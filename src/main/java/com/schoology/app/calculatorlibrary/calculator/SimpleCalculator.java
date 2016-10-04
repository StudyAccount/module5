package com.schoology.app.calculatorlibrary.calculator;

import com.schoology.app.calculatorlibrary.types.DoubleType;
import com.schoology.app.calculatorlibrary.types.LongType;
import com.schoology.app.calculatorlibrary.types.TypeSupport;

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

            return 3;
        }

    }

    @Override
    public String calculate(String input) {



        return null;
    }
}
