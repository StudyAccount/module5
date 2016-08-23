package com.schoology.app.calculatorlibrary.types;

/**
 * Created by User on 23.08.2016.
 */
public class FloatType implements TypeSupport {

    public boolean checkForTypeSupport(String inputData) {

        try{

            Float.parseFloat(inputData);

        }catch (NumberFormatException e){

            return false;
        }

        return true;
    }
}
