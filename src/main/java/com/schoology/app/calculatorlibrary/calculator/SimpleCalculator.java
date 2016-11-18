package com.schoology.app.calculatorlibrary.calculator;

import com.schoology.app.calculatorlibrary.excaption.UnsupportedOperationException;
import com.schoology.app.calculatorlibrary.excaption.UnsupportedTypeException;
import com.schoology.app.calculatorlibrary.operations.*;
import com.schoology.app.calculatorlibrary.parser.Parser;
import com.schoology.app.calculatorlibrary.provider.OperationProvider;
import com.schoology.app.calculatorlibrary.provider.SimpleOperationProvider;
import com.schoology.app.calculatorlibrary.registry.Registry;
import com.schoology.app.calculatorlibrary.types.DoubleSupportedType;
import com.schoology.app.calculatorlibrary.types.LongSupportedType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.10.2016.
 */
public class SimpleCalculator implements Calculator {

    Registry registry = new Registry();

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    @Override
    public void init() {

        registry.addNewType(new DoubleSupportedType());
        registry.addNewType(new LongSupportedType());
        registry.addNewOperation(new AdditionLong());
        registry.addNewOperation(new AdditionDouble());
        registry.addNewOperation(new SubtractionLong());
        registry.addNewOperation(new SubtractionDouble());
    }

    @Override
    public String calculate(String input) {

        Operation currentOperation;
        String type;
        String operation = null;
        List<String> operands = new ArrayList<>();

        Parser parser = new Parser(operation, operands);
        OperationProvider operationProvider = new SimpleOperationProvider();

        parser.parser(input);
        parser.getOperands();

        try {
            type = operationProvider.getTypeIfIsSupported(parser.getOperands(), registry.getAvailableTypesList());
        } catch (UnsupportedTypeException e) {
            return e.toString();

        }

        try {
            currentOperation = operationProvider.getOperationIfIsSupported(parser.getOperation(),
                    registry.getAvailableOperationsList(), type);

        } catch (UnsupportedOperationException e) {
            return e.toString();
        }

        String result = currentOperation.count(parser.getOperands());

        return result.toString();
    }
}
