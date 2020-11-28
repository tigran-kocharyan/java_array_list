package ru.towowka;

import java.util.Optional;

/**
 * Класс для реализации базового функционала ArrayList типа T.
 * @param <T>
 */
public class ArrayList<T> implements Listable<T> {
    private Object[] array;
    private int size;

    public ArrayList() {
        array = new Object[10];
        size = 0;
    }

    /**
     * @return Размер массива.
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Метод получения элемента по индексу.
     * @param index
     */
    @Override
    public Optional<T> getAt(int index) {
        if(index >= size || index < 0) {
            return Optional.empty();
        } else {
            return Optional.of((T) array[index]);
        }
    }

    /**
     * Метод вставки в конец ArrayList.
     * @param element
     */
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

    /**
     * Удаляет все элементы массива.
     */
    @Override
    public void clear() {
        array = new Object[10];
        size = 0;
    }

    /**
     * Проверка на наличие элемента в массиве.
     * @param element
     * @return если element есть в массиве, то true, если же отсутствует - то false.
     */
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
