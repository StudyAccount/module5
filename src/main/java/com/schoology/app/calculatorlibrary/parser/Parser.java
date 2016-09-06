package com.schoology.app.calculatorlibrary.parser;

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

        int iterator = 0;
        int comaCounter = 0;
        StringBuilder inputData = new StringBuilder();
        inputData.append(inputString);
        StringBuilder tempValues = new StringBuilder();

        if (inputData.length() == 0){
            System.out.println("Nothing was entered");
        }

        while (iterator < inputData.length()){

            while (inputData.charAt(iterator) != ASCII_COMA){

                tempValues.append(inputData.charAt(iterator));
                iterator++;

                if (inputData.charAt(iterator) == ASCII_COMA) {
                    comaCounter++;
                }
            }

            if (comaCounter > 0){

                operation.add(tempValues.toString());
            } else {

                operands.add(tempValues.toString());
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
