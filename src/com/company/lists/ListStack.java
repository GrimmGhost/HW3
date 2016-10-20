package com.company.lists;

import com.company.exceptions.EmptyStackException;
import com.company.interfaces.Stack;

/**
 * Created by fili_ on 10/12/2016.
 */
public class ListStack extends LinkedList implements Stack
{

    @Override
    public boolean isEmpty()
    {
        return getSize() != 0;
    }

    @Override
    public Object peek() throws EmptyStackException
    {
        // view top value
        return getHead();
    }

    @Override
    public Object pop() throws EmptyStackException
    {
        // remove top then return it
        return removeBack();
    }

    @Override
    public void push(Object item)
    {
        // view top value first before pushing
        // if

        // insertFront
        insertBack(item);
        System.out.println("pushed: " + item);
    }
}
