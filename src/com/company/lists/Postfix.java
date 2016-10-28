package com.company.lists;

import com.company.interfaces.List;
import com.company.interfaces.Queue;
import com.company.interfaces.Stack;

/**
 * Created by fili_ on 10/12/2016.
 */
public class Postfix
{
    private Stack stack;
    private Queue queue;
    private String expression;

    public Postfix(String expression)
    {
        System.out.println("PostFix: " + expression);
    }

    public double evaluate(List operands)
    {
        
        return 0.0;
    }
}
