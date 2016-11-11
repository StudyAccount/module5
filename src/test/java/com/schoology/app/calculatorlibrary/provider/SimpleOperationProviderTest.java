package com.schoology.app.calculatorlibrary.provider;

import com.schoology.app.calculatorlibrary.excaption.UnsupportedTypeException;
import com.schoology.app.calculatorlibrary.operations.*;
import com.schoology.app.calculatorlibrary.types.DoubleSupportedType;
import com.schoology.app.calculatorlibrary.types.LongSupportedType;
import com.schoology.app.calculatorlibrary.types.SupportedType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SleepWalker on 11.11.2016.
 */
public class SimpleOperationProviderTest {

    private List<String> operands = new ArrayList<>();
    private List<SupportedType> supportedTypesList = new ArrayList<>();
    private List<Operation> supportedOperations = new ArrayList<>();
    private String operation;
    private String expectedType;
    private Operation expectedOperation;
    private String resultType;
    SimpleOperationProvider simpleOperationProvider;
    private String checkType;
    private String currentType;
    private Operation currentOperation;

    @Before
    public void setUp() throws Exception {
        simpleOperationProvider = new SimpleOperationProvider();

        supportedTypesList.add(new LongSupportedType());
        supportedTypesList.add(new DoubleSupportedType());

        supportedOperations.add(new AdditionLong());
        supportedOperations.add(new AdditionDouble());
        supportedOperations.add(new SubtractionLong());
        supportedOperations.add(new SubtractionDouble());

    }

    @Test
    public void testGetIfTypeIfIsSupported() throws Exception {
        operands.clear();
        operands.add("7");
        operands.add("7");
        expectedType = "long";
        currentType = simpleOperationProvider.getTypeIfIsSupported(operands, supportedTypesList);
        Assert.assertEquals(expectedType, currentType);
    }

    @Test
    public void testOperationIfIsSupported() throws Exception {
        operands.clear();
        operands.add("33D");
        operands.add("2.3333");
        operation = "+";
        checkType = "double";
        expectedOperation = supportedOperations.get(1);
        currentOperation = simpleOperationProvider.getOperationIfIsSupported(operation, supportedOperations, checkType);
        Assert.assertEquals(expectedOperation, currentOperation);
    }

}