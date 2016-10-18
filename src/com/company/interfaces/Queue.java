package com.company.interfaces;

import com.company.exceptions.EmptyQueueException;
/**
 * Created by fili_ on 10/12/2016.
 */



public interface Queue
{
    public int getSize();
    public boolean isEmpty();
    public Object peek() throws EmptyQueueException;
    public Object deQueue() throws EmptyQueueException;
    public void enQueue(Object item);
}
