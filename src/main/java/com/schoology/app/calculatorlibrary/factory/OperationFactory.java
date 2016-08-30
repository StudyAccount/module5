package com.schoology.app.calculatorlibrary.factory;

import com.schoology.app.calculatorlibrary.operations.Operation;

/**
 * Created by User on 30.08.2016.
 */
public interface OperationFactory {
    Operation getOperationInstance (int operationCode);
}
