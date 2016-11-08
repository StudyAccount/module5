package com.schoology.app.calculatorlibrary.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 06.09.2016.
 */
public class Parser {

    private static final int ASCII_COMA = 44;
    private String operation;
    private List<String> operands;

    public Parser(String operation, List<String> operands) {
        this.operation = operation;
        this.operands = operands;
    }

    public void parser (String inputString){
        operation = null;
        operands = new ArrayList<>();

        int iterator = 0;
        StringBuilder inputData = new StringBuilder();
        inputData.append(inputString);
        StringBuilder tempValues = new StringBuilder();

        while (iterator < inputData.length()){

            while((iterator < inputData.length()) && (inputData.charAt(iterator) != ASCII_COMA) ) {

                tempValues.append(inputData.charAt(iterator));
                iterator++;
            }

            if (operation == null){

                operation = tempValues.toString();
                tempValues.delete(0, tempValues.length());
            } else {

                operands.add(tempValues.toString());
                tempValues.delete(0, tempValues.length());
            }

            iterator++;
        }
    }

    public List<String> getOperands() {
        return operands;
    }

    public String getOperation() {
        return operation;
    }
}
