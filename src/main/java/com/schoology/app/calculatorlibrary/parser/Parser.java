package com.schoology.app.calculatorlibrary.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 06.09.2016.
 */
public class Parser {

    private static final int ASCII_COMA = 44;
    private List<String> operation;
    private List<String> operands;

    public Parser(List<String> operation, List<String> operands) {
        this.operation = operation;
        this.operands = operands;
    }

    public void parser (String inputString){
        operation = new ArrayList<>();
        operands = new ArrayList<>();

        int iterator = 0;
        StringBuilder inputData = new StringBuilder();
        inputData.append(inputString);
        StringBuilder tempValues = new StringBuilder();

        if (inputData.length() == 0){
            System.out.println("Nothing was entered");
        }

        while (iterator < inputData.length()){

            while((iterator < inputData.length()) && (inputData.charAt(iterator) != ASCII_COMA) ) {

                tempValues.append(inputData.charAt(iterator));
                iterator++;
            }

            if (operation.isEmpty()){

                operation.add(tempValues.toString());
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

    public List<String> getOperation() {
        return operation;
    }
}
