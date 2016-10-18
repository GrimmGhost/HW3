package com.company.interfaces;

/**
 * Created by fili_ on 10/12/2016.
 */
public interface List
{
    public int getSize();
    public void insertFront(Object item);
    public void insertBack(Object item);
    public Object removeFront();
    public Object removeBack();
    public Object get(int index);
}
