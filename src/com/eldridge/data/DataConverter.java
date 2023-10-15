package com.eldridge.data;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

public class DataConverter {
    private static final String expectedCitationNotInRangeErrorMsg = "ERROR, one citation parameter is not within expected range 0-99.";
    public List<Integer> convertToIntegerList(String[] inputStrings) {
        List<String> stringList = Arrays.asList(inputStrings);
        List<Integer> integerList = stringList.parallelStream().map(Integer::parseInt).toList();
        if (!integerList.parallelStream().allMatch(e -> e >= 0 && e < 100)) {
            throw new InvalidParameterException(expectedCitationNotInRangeErrorMsg);
        }
        return integerList;
    }
}
