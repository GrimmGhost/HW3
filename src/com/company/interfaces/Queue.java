package com.company.interfaces;

import com.company.exceptions.EmptyQueueException;
/**
 * Created by fili_ on 10/12/2016.
 */



public interface Queue
{
    int getSize();
    boolean isEmpty();
    Object peek() throws EmptyQueueException;
    Object deQueue() throws EmptyQueueException;
    void enQueue(Object item);
}
