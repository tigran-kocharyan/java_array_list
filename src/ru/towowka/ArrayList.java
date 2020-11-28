package ru.towowka;

import java.util.Optional;

public class ArrayList<T> implements Listable<T> {
    private Object[] array;
    private int size;

    public ArrayList() {
        array = new Object[10];
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Optional<T> getAt(int index) {
        if(index >= size || index < 0) {
            return Optional.empty();
        } else {
            return Optional.of((T) array[index]);
        }
    }

    @Override
    public void put(T element) {
        if(size+1>=array.length) {
            Object[] newArray = new Object[array.length * 2];
            if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            array[size+1] = element;
            size++;
        }
        else {
            array[size] = element;
            size++;
        }
    }

    @Override
    public void clear() {
        array = new Object[10];
    }

    @Override
    public boolean contains(T element) {
        for (Object arrayElement : array) {
            if(element.equals(arrayElement) ){
                return true;
            }
        }
        return false;
    }
}
