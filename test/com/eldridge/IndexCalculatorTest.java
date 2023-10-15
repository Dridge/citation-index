package com.eldridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IndexCalculatorTest {
    @Test
    public void givenSimpleCitationList_WhenCalculatingIndex_ThenCorrectIndexReturned() {
        List<Integer> citationList = new ArrayList<>();
        citationList.add(0);
        citationList.add(2);
        citationList.add(99);

        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(2, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenCitationList_WhenLastCitationIsTheIndexValue_ThenLastCitationIsReturned(){
        List<Integer> citationList = new ArrayList<>();
        citationList.add(1);
        citationList.add(1);
        citationList.add(3);
        citationList.add(2);

        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(2, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenCitationList_WhenFirstCitationIsTheIndexValue_ThenFirstCitationIsReturned(){
        List<Integer> citationList = new ArrayList<>();
        citationList.add(2);
        citationList.add(1);
        citationList.add(1);
        citationList.add(3);
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(2, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenComplexCitationList_WhenCalculatingCitation_ThenCorrectCitationIsReturned(){
        List<Integer> citationList = new ArrayList<>();
        citationList.add(1);
        citationList.add(5);
        citationList.add(2);
        citationList.add(5);
        citationList.add(3);
        citationList.add(1);
        citationList.add(5);
        citationList.add(5);
        citationList.add(6);
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(5, underTest.calculateIndex(citationList));
    }
}
