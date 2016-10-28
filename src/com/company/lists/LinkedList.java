package com.company.lists;

import com.company.interfaces.List;
import com.company.interfaces.Queue;

/**
 * Created by fili_ on 10/12/2016.
 */
public class LinkedList implements List
{
    //Node dataNode = new Node();
    private Node headNode = null;
    private Node tailNode = null;
    // LinkedList size
    private int size = 0;

    protected Node getHead()
    {
        return headNode;
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void insertFront(Object item)
    {
        if (headNode == null)
        {
            headNode = new Node();
            headNode.setData(item);
            tailNode = headNode;
            size++;
        }else if (this instanceof ListQueue)
        {
            // instance of queue you will change the tail but leave the head in the same place
            Node node = new Node();
            node.setData(item);
            tailNode.setNext(node);
            tailNode = node;
            size++;
        }else // has to be an instance of ListStack
        {
            Node node = new Node();
            node.setData(item);
            node.setNext(headNode);
            headNode = node;
            size++;
        }
    }

    @Override
    public void insertBack(Object item)
    {
        if (tailNode == null)
        {
            // only here because of duplicate code error IDE was giving me
            System.out.print("");
            tailNode = new Node();

            tailNode.setData(item);
            headNode = tailNode;
            size++;
        }else
        {
            Node node = new Node();
            node.setData(item);
            node.setNext(tailNode);
            tailNode = node;
            size++;
        }
    }

    @Override
    public Object removeFront()
    {
        Object item = headNode.getData();
        headNode = headNode.getNext();
        size--;
        return item;
    }

    @Override
    public Object removeBack()
    {
        Object item = tailNode.getData();
        tailNode = tailNode.getNext();
        return item;
    }

// what is this for?
// is this for test purposes?
    @Override
    public Object get(int index)
    {
        return null;
    }
}
