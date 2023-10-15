package com.eldridge;

import com.eldridge.data.DataConverter;

import java.util.List;
public class CitationIndex {
    public static void main(String[] args) {
        DataConverter converter = new DataConverter();
        // convert from strings to integer list
        List<Integer> citationCountList = converter.convertToIntegerList(args);
        System.out.println(citationCountList);

        // take candidate numbers, citations for each paper

        // memory constraints?

        // fastest response?

        // multithreading?
    }

}
