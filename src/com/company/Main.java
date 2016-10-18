package com.company;

import com.company.Lists.Infix;
import com.company.Lists.LinkedList;
import com.company.Lists.Postfix;

public class Main
{

    public static void main(String[] args)
    {

    }
    public static void run(String infixFile, String operandsFile)
    {
        // make operands LinkedList
        LinkedList operands = new LinkedList();

        // make Postfix Object that gets created from Infix
        Postfix eval = (new Infix(infixFile).toPostfix());
        //
        eval.evaluate(operands);
    }
}
