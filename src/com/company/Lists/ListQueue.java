package com.company.Lists;

import com.company.exceptions.EmptyQueueException;
import com.company.interfaces.Queue;

/**
 * Created by fili_ on 10/12/2016.
 */
public class ListQueue extends LinkedList implements Queue
{

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public Object peek() throws EmptyQueueException
    {
        return null;
    }

    @Override
    public Object deQueue() throws EmptyQueueException
    {
        return null;
    }

    @Override
    public void enQueue(Object item)
    {

    }
}
