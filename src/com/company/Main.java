package com.company;

import com.company.lists.Infix;
import com.company.lists.LinkedList;
import com.company.lists.Postfix;
import com.company.utils.FileReader;

public class Main
{

    public static void main(String[] args)
    {
        run("infix.dat","operands.dat");
    }

    public static void run(String infixFile, String operandsFile)
    {

        //FileReader fileReader = new FileReader();
        //StringBuilder infixString = fileReader.stringBuilder(infixFile);
        //System.out.println(infixString.length());
        //String d = new String();
        Infix infix = new Infix("a*(b+c)");
        Postfix postfix = infix.toPostfix();

    }
}
