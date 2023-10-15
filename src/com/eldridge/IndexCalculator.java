package com.eldridge;

import java.util.Collections;
import java.util.List;

public class IndexCalculator {
    public int calculateIndex(List<Integer> citations) {
        int numberOfEntries = citations.size();
        // Sort to infer how many papers match that citation count or above
        Collections.sort(citations);
        int indexValue = 0;
        for (Integer citation : citations) {
            int numberOfEntriesEqualOrMoreThan = numberOfEntries - citations.indexOf(citation);
            if (citation <= numberOfEntriesEqualOrMoreThan) {
                indexValue = citation;
            }
        }
        return indexValue;
    }
}
