package com.schoology.app.calculatorlibrary.excaption;

/**
 * Created by User on 04.10.2016.
 */
public class UnsupportedTypeException extends Exception{

    public UnsupportedTypeException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
