package com.schoology.app.calculatorlibrary.types;

/**
 * Created by User on 23.08.2016.
 */
public class IntType implements TypeSupport {
    @Override
    public boolean checkForTypeSupport(String inputData) {

        try {

            Integer.parseInt(inputData);

        } catch (NumberFormatException e){

            return false;
        }
        return true;
    }
}
