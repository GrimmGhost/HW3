package com.company.lists;

import com.company.Operand;
import com.company.exceptions.EmptyQueueException;
import com.company.exceptions.EmptyStackException;
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
        this.expression = expression;
        queue = new ListQueue();
        stack = new ListStack();
    }

    public double evaluate(List operands)
    {
        // get operands list
        double finalSolution = 0.0;

        //for (int charNumber = 0; charNumber < expression.length(); charNumber++)
        //{
        //    System.out.println("Operand: " + expression.charAt(charNumber));
        //    Object item = expression.charAt(charNumber);
            // check operands list and get value
            // return character - 'a'
            // example 'a' - 'a' = 0      'b' - 'a' = 1
        //    operands.get((int) expression.charAt(charNumber) - 'a');
        //    queue.enQueue(item);
        //}
        // enqueue expression to queue
        for (int charNumber = 0; charNumber < expression.length(); charNumber++)
        {
            //System.out.println(expression.charAt(charNumber));
            queue.enQueue(expression.charAt(charNumber));
        }
        while (!queue.isEmpty())
        {
            try
            {
                Object item = queue.deQueue();

                // if letter is dequeue find value in operands list and push to stack
                if (item.toString().matches("[a-zA-Z]"))
                {
                    Node node = (Node) operands.get(item.toString().charAt(0) - 'a');
                    Operand op = (Operand) node.getData();
                    stack.push(op.getValue());
                }else
                    // if operator is dequeue pop stack two times and perform operation
                    if (item.toString().matches("[+-/*]"))
                {
                    double operand1 = (double) stack.pop();
                    double operand2 = (double) stack.pop();

                    switch (item.toString())
                    {
                        case "+":
                            stack.push(operand1 + operand2);
                            break;
                        case "-":
                            stack.push(operand1 - operand2);
                            break;
                        case "/":
                            stack.push(operand1 / operand2);
                            break;
                        case "*":
                            stack.push(operand1 * operand2);
                            break;
                    }
                }
            } catch (EmptyQueueException e)
            {
                e.printStackTrace();
            } catch (EmptyStackException e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            finalSolution = (double) stack.pop();
        } catch (EmptyStackException e)
        {
            e.printStackTrace();
        }
        return finalSolution;
    }
}
