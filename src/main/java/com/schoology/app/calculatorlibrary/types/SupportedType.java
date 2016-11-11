package com.schoology.app.calculatorlibrary.types;

/**
 * Created by User on 23.08.2016.
 */
public interface SupportedType {

    boolean checkType(String inputData);

    String getTypeName();
}
