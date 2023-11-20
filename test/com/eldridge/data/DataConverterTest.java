package com.eldridge.data;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DataConverterTest {

    @Test
    public void givenArrayOfValidNumbers_WhenConvertingToIntegerList_ThenIsConvertedCorrectly() {
        String[] stringInputs = new String[]{"2", "1", "99", "0"};
        List<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(2);
        expectedOutput.add(1);
        expectedOutput.add(99);
        expectedOutput.add(0);
        DataConverter underTest = new DataConverter();
        assertEquals(expectedOutput, underTest.convertToIntegerList(stringInputs));
    }

    @Test
    public void givenNegativeNumber_WhenConvertingToIntegerList_ThenThrowExceptionWithInformation() {
        String[] stringInputs = new String[]{"-1"};
        DataConverter underTest = new DataConverter();
        Exception thrown = assertThrows(InvalidParameterException.class, () -> {
            underTest.convertToIntegerList(stringInputs);
        });
        assertEquals("ERROR, one citation parameter is not within expected range must be greater than 0.", thrown.getMessage());
    }

    @Test
    public void givenNullInput_WhenConvertingToIntegerList_ThenThrowExceptionWithInformation() {
        String[] stringInputs = new String[]{"1", null, "3"};
        DataConverter underTest = new DataConverter();
        Exception thrown = assertThrows(NumberFormatException.class, () -> {
            underTest.convertToIntegerList(stringInputs);
        });
        assertEquals("Cannot parse null string", thrown.getMessage());
    }

    @Test
    public void givenInvalidNumberAsInput_WhenConvertingToIntegerList_ThenThrowExceptionWithInformation() {
        String[] stringInputs = new String[]{"1", "notANumber", "3"};
        DataConverter underTest = new DataConverter();
        Exception thrown = assertThrows(NumberFormatException.class, () -> {
            underTest.convertToIntegerList(stringInputs);
        });
        assertEquals("For input string: \"notANumber\"", thrown.getMessage());
    }
}
