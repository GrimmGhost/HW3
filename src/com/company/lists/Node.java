package com.company.lists;

/**
 * Created by fili_ on 10/12/2016.
 */
public class Node
{
    private Object data;
    private Node next;

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
