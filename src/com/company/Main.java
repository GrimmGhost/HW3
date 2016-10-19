package com.company;

import com.company.lists.Infix;
import com.company.lists.LinkedList;
import com.company.lists.Postfix;
import com.company.utils.FileReader;

public class Main
{

    public static void main(String[] args)
    {
        run(FileReader.lineSplit("infix"),FileReader.lineSplit("values"));
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
