package com.schoology.app.calculatorlibrary.provider;

import com.schoology.app.calculatorlibrary.excaption.UnsupportedOperationException;
import com.schoology.app.calculatorlibrary.excaption.UnsupportedTypeException;
import com.schoology.app.calculatorlibrary.operations.Operation;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.util.List;

/**
 * Created by User on 11.11.2016.
 */
public interface OperationProvider {

    String checkIfTypeIsSupported(List<String> operands, List<SupportedType> supportedTypeList)

            throws UnsupportedTypeException;

    Operation getOperationIfIsSupported(String operation, List<Operation> supportedOperations, String type)
            throws UnsupportedOperationException;


}
