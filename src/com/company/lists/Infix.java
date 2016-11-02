package com.company.lists;

import com.company.exceptions.EmptyQueueException;
import com.company.exceptions.EmptyStackException;
import javafx.scene.web.WebHistory;


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

        System.out.println("//================= infixFile ===================//");
        System.out.println("Current Expression " +expression);
        System.out.println("---------------------------------------------------");

        //toPostfix();
    }

    public Postfix toPostfix()
    {
        // traverse characters and

        // convert queue into String
        queue = new ListQueue();
        stack = new ListStack();

        for (int charNumber = 0; charNumber < expression.length(); charNumber++)
        {
            Object item = expression.charAt(charNumber);
            //System.out.println(item);

            //if ( item.toString() == "+" || item == "-" || item == "*"
            //        || item == "/" || item == "(")
            if (item.toString().matches("[+-/*(]"))
            {
                //System.out.println(expression.charAt(charNumber));
                stack.push(item);
            }else if (item.toString().matches("[a-zA-Z]"))
            {
                //System.out.println(expression.charAt(charNumber));
                queue.enQueue(item);
            }else if (item.toString().matches("[)]"))
            {
                // pop from stack until open parenthesis is found
                try
                {
                    // This is the bug
                    // fix this
                    // i don't know how

                    // check if open parenthesis
                    // pop and enqueue
                    // back to first step0

                    // check if next in stack is a open parenthesis
                    Node peek = (Node) stack.peek();
                    Object topStack = peek.getData();

                    // BUG BUG
                    // WHY YOU BUG
                    // RAID THIS NOW!!!

                    while (!topStack.toString().equals("("))
                    //while (!topStack.equals("("))
                    //while (!"(".equals(topStack))
                    //while (topStack != "(")
                    {
                        queue.enQueue(stack.pop());
                        peek = (Node) stack.peek();
                        topStack = peek.getData();
                    }
                    stack.pop();
                } catch (EmptyStackException e)
                {
                    e.printStackTrace();
                }
            }
            // Convert into String
            //StringBuilder sb = new StringBuilder();
        }
        // while the stack still has values
        // pop until empty
        try
        {
            //Node peek = (Node) stack.peek();
            //Object topStack = peek.getData();
            //Boolean emptyStack = stack.isEmpty();

            while (!stack.isEmpty())
            {
                queue.enQueue(((Node) stack.peek()).getData());
                stack.pop();
            }
        } catch (EmptyStackException e)
        {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty())
        {
            try
            {
                String op = queue.deQueue().toString();
                sb.append(op);
            } catch (EmptyQueueException e)
            {
                e.printStackTrace();
            }
        }
        //System.out.print(sb);
        return new Postfix(sb.toString());
    }
}
