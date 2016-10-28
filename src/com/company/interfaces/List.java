package com.company.interfaces;

/**
 * Created by fili_ on 10/12/2016.
 */
public interface List
{
    int getSize();
    void insertFront(Object item);
    void insertBack(Object item);
    Object removeFront();
    Object removeBack();
    Object get(int index);
}
