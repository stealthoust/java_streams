package org.example.exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxValuesTest {

    @Test
    void maximum() {
        List<Integer> list = new ArrayList<>() {
            {
                add(2);
                add(5);
                add(1);
                add(3);
                add(10);
                add(8);
            }
        };
        assertEquals(10,MaxValues.maximum(list));
    }


}