package com.company.exceptions;

/**
 * Created by fili_ on 10/12/2016.
 */
public class EmptyQueueException extends Exception
{
    public EmptyQueueException(String message)
    {
        //super(message);
        System.out.print("The DMV is closed");
    }
}
