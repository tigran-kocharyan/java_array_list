package ru.towowka;

import java.util.Optional;

public interface Listable<T> {
    int getSize();

    Optional<T> getAt(int index);

    void put(T element);

    void clear();

    boolean contains(T element);
}
