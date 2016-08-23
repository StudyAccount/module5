package com.schoology.app.calculatorlibrary.types;

/**
 * Created by User on 23.08.2016.
 */
public class LongType implements TypeSupport {
    @Override
    public boolean checkForTypeSupport(String inputData) {

        try {

            Long.parseLong(inputData);

        } catch (NumberFormatException e){

            return false;
        }

        return true;
    }
}
