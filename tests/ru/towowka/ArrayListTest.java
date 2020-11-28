package ru.towowka;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    public void Check_Put() {
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.put(5);
        assertEquals(array.getSize(), 1);
    }

    @Test
    public void Check_GetAt() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.put(1);
        array.put(2);
        array.put(3);
        array.put(4);
        array.put(5);

        assertEquals(5, array.getSize());
        assertEquals(5, array.getAt(4).get());
        assertEquals(1, array.getAt(0).get());
    }

    @Test
    public void Check_OutOfRange() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.put(1);

        assertEquals(Optional.empty(), array.getAt(2));
    }
}