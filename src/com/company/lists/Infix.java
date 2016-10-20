package com.company.lists;

import com.company.exceptions.EmptyQueueException;
import com.company.lists.ListQueue;
import com.company.lists.ListStack;
import com.company.lists.Postfix;
import com.company.Operand;

/**
 * Created by fili_ on 10/12/2016.
 */
public class Infix
{
    private ListStack stack;
    private ListQueue queue;
    private String expression;

    public Infix(String expression)
    {
        this.expression = expression;
        System.out.println("------------------");
        System.out.println("Current Expression " +expression);
        System.out.println("------------------");
        toPostfix();
    }

    public Postfix toPostfix()
    {
        // traverse characters and
        // convert queue into String

        StringBuilder postfixExpression = null;

        while (!queue.isEmpty())
        {
            try {
                postfixExpression.append((String) queue.deQueue());
            } catch (EmptyQueueException e)
            {
                e.printStackTrace();
            }
        }
        return new Postfix(postfixExpression.toString());
    }
}
