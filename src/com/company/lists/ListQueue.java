package com.company.lists;

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
        return getSize() <= 0;
    }

    @Override
    public Object peek() throws EmptyQueueException
    {
        return getHead();
    }

    @Override
    public Object deQueue() throws EmptyQueueException
    {
        // remove and return item
        return removeFront();
    }

    @Override
    public void enQueue(Object item)
    {
        //System.out.println((Character) item);
        insertFront(item);
        System.out.println("enQueued: " + item);
    }
}
