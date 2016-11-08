package com.schoology.app.calculatorlibrary.Register;

import java.util.List;

/**
 * Created by SleepWalker on 08.11.2016.
 */
public class Register {

    private List<String> registeredData;

    public void addData(String input) {

        registeredData.add(input);
    }

    public List<String> getRegisteredData() {

        return registeredData;
    }
}
