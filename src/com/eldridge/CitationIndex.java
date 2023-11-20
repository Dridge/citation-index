package com.eldridge;

import com.eldridge.data.DataConverter;

public class CitationIndex {
    public static void main(String[] args) {
        DataConverter converter = new DataConverter();
        IndexCalculator calculator = new IndexCalculator();
        new Application(converter, calculator, args).run();
    }

}
