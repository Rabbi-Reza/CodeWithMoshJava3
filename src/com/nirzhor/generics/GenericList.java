package com.nirzhor.generics;

//public class GenericList<T extends Number> { // <- class
// public class GenericList<T extends Comparable & Cloneable> { // <- Interface
    public class GenericList<T > { // <- Interface
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
       items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }


}
