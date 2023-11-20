package com.eldridge;

import com.eldridge.data.DataConverter;

import java.util.List;

public class Application {
    DataConverter converter;
    IndexCalculator calculator;
    String[] inputs;
    public Application(DataConverter converter, IndexCalculator calculator, String[] args) {
        this.converter = converter;
        this.calculator = calculator;
        this.inputs = args;
    }

    public void run() {
        List<Integer> citationCountList = converter.convertToIntegerList(inputs);
        System.out.println(citationCountList);
        int index = calculator.calculateIndex(citationCountList);
        System.out.println(index);
    }
}
