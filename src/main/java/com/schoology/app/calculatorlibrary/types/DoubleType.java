package com.schoology.app.calculatorlibrary.types;

/**
 * Created by User on 23.08.2016.
 */
public class DoubleType implements TypeSupport {

@Override
    public boolean checkForTypeSupport(String inputData) {

        try{

            Double.parseDouble(inputData);

        }catch (NumberFormatException e){

            return false;
        }

        return true;
    }
}
