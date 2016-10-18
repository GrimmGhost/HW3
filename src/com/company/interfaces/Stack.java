package com.company.interfaces;

import com.company.exceptions.EmptyStackException;
/**
 * Created by fili_ on 10/12/2016.
 */
public interface Stack
{
    public int getSize();
    public boolean isEmpty();
    public Object peek() throws EmptyStackException;
    public Object pop() throws EmptyStackException;
    public void push(Object item);

}
