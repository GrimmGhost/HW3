package com.company.Lists;

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
        return false;
    }

    @Override
    public Object peek() throws EmptyStackException
    {
        // view top value
        return super.getHead();
    }

    @Override
    public Object pop() throws EmptyStackException
    {
        // remove top then return it
        return super.removeBack();
    }

    @Override
    public void push(Object item)
    {
        // view top value first before pushing
        // if

        // insertFront
        super.insertBack(item);
    }
}
