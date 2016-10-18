package com.company.Lists;

import com.company.interfaces.List;

/**
 * Created by fili_ on 10/12/2016.
 */
public class LinkedList implements List
{
    Node dataNode = new Node();
    Node headNode = null;
    Node tailNode = null;
    // use counter for LinkedList size
    // keeps me from having to traverse the List to get size
    int size = 0;

    protected Node getHead()
    {
        return headNode;
    }

    @Override
    public int getSize()
    {
        return size;
    }

    // insert to headNode
    @Override
    public void insertFront(Object item)
    {
        if (headNode == null)
        {
            headNode = new Node();
            headNode.setData(item);
            tailNode = headNode;
            size++;
        }else
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
