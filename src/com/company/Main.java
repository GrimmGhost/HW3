package com.company;

import com.company.lists.Infix;
import com.company.lists.LinkedList;
import com.company.lists.Postfix;
import com.company.utils.FileReader;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        run("infix.dat","values.dat");
    }

    public static void run(String infixFile, String operandsFile)
    {

        //================= infixFile ===================//


        FileReader fileReader = new FileReader();
        //String infixString = fileReader.stringBuilder(infixFile);
        LinkedList operandsList = fileReader.stringBuilderOp(operandsFile);
        Scanner lineScanner = new Scanner(fileReader.stringBuilder(infixFile));
        Infix infix;
        Postfix postfix;
        while (lineScanner.hasNext())
        {
            infix = new Infix(lineScanner.next());
            postfix = infix.toPostfix();
            System.out.println("Postfix evaluation is " + postfix.evaluate(operandsList));
        }
    }
}
