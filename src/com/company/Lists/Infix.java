package com.company.Lists;

import com.company.Lists.ListQueue;
import com.company.Lists.ListStack;
import com.company.Lists.Postfix;
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

        toPostfix();
    }

    public Postfix toPostfix()
    {
        return null;
    }
}
