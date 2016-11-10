package com.schoology.app.calculatorlibrary.factory;

import com.schoology.app.calculatorlibrary.operations.Operation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.11.2016.
 */
public class OperationRegistry {

    List<Operation> availableOperationsList = new ArrayList<>();

    public void addNewOperation(Operation operation){
        availableOperationsList.add(operation);
    }

    public List<Operation> getAvailableOperationsList() {
        return availableOperationsList;
    }
}
