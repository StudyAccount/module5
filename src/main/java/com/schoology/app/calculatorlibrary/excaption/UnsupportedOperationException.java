package com.schoology.app.calculatorlibrary.excaption;

/**
 * Created by SleepWalker on 10.11.2016.
 */
public class UnsupportedOperationException extends Exception {

    public UnsupportedOperationException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
