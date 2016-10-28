package com.company.interfaces;

import com.company.exceptions.EmptyStackException;
/**
 * Created by fili_ on 10/12/2016.
 */
public interface Stack
{
    int getSize();
    boolean isEmpty();
    Object peek() throws EmptyStackException;
    Object pop() throws EmptyStackException;
    void push(Object item);

}
