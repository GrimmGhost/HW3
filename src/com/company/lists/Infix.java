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

        System.out.println("------------------");
        System.out.println("Current Expression " +expression);
        System.out.println("------------------");

        toPostfix();
    }

    public Postfix toPostfix()
    {
        // traverse characters and

        // convert queue into String
        for (int charNumber = 0; charNumber < expression.length(); charNumber++)
        {
            queue = new ListQueue();
            stack = new ListStack();
            Object item = expression.charAt(charNumber);
            System.out.println(item);

            if ((Character) item == '+' || (Character) item == '-' || (Character) item == '*'
                    || (Character) item == '/' || (Character) item == '(')
            {
                //System.out.println(expression.charAt(charNumber));
                stack.push(item);
            }else if (Character.isLetter((Character) item))
            {
                //System.out.println(expression.charAt(charNumber));
                queue.enQueue(item);
            }else if ((Character) item == ')')
            {
                // pop from stack until open parenthesis is found
                try
                {
                    while ((Character) stack.peek() != '(')
                    {
                        queue.enQueue(stack.pop());
                    }

                    //remove open parenthesis
                    stack.pop();
                } catch (EmptyStackException e)
                {
                    e.printStackTrace();
                }
            }

            // Convert into String
            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty())
            {
                try
                {
                    String op = (String) queue.deQueue();
                    sb.append(op);
                } catch (EmptyQueueException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.print(sb);
        }
        return null;
    }
}
