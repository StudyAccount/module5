package com.schoology.app.calculatorlibrary.registry;

import com.schoology.app.calculatorlibrary.operations.Operation;
import com.schoology.app.calculatorlibrary.types.SupportedType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.11.2016.
 */
public class Registry {

    private List<Operation> availableOperationsList = new ArrayList<>();
    private List<SupportedType> availableTypesList =  new ArrayList<>();

    public void addNewType(SupportedType supportedType){
        availableTypesList.add(supportedType);
    }

    public void addNewOperation(Operation operation){
        availableOperationsList.add(operation);
    }

    public List<SupportedType> getAvailableTypesList() {
        return availableTypesList;
    }

    public List<Operation> getAvailableOperationsList() {
        return availableOperationsList;
    }
}
