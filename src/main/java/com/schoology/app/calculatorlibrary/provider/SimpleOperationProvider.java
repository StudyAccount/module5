package com.schoology.app.calculatorlibrary.provider;

import com.schoology.app.calculatorlibrary.excaption.UnsupportedOperationException;
import com.schoology.app.calculatorlibrary.excaption.UnsupportedTypeException;
import com.schoology.app.calculatorlibrary.operations.Operation;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.util.List;

/**
 * Created by User on 11.11.2016.
 */
public class SimpleOperationProvider implements OperationProvider {

    @Override
    public String checkIfTypeIsSupported(List<String> operands, List<SupportedType> supportedTypesList)
            throws UnsupportedTypeException {

        boolean isSupportedType = false;

        for (SupportedType types : supportedTypesList){

            for(String operand : operands){

                if(types.checkType(operand) == false){

                    isSupportedType = false;
                    break;
                }

                isSupportedType = true;
            }

            if (isSupportedType == true){

                return types.getTypeName();
            }
        }

        throw new UnsupportedTypeException("Current types are not supported");
    }

    @Override
    public Operation getOperationIfIsSupported(String operation, List<Operation> supportedOperations, String checkType)
            throws UnsupportedOperationException {

        for (Operation operations : supportedOperations){

            if (operations.getOperationSymbol().equals(operation) && operations.getTypeOfOperands().equals(checkType)) {
                return operations;
            }
        }

        throw new UnsupportedOperationException("Current operation is not supported");
    }
}
