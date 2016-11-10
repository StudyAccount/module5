package com.schoology.app.calculatorlibrary.types;

/**
 * Created by User on 23.08.2016.
 */
public class DoubleSupportedType implements SupportedType {

    @Override
    public boolean checkType(String inputData) {

        try{

            Double.parseDouble(inputData);

        }catch (NumberFormatException e){

            return false;
        }

        return true;
    }
}
