package com.company.utils;

import com.company.Operand;
import com.company.lists.LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by fili_ on 10/18/2016.
 */
public class FileReader
{
    public String stringBuilder(String fileName)
    {
        StringBuilder stringStorage = new StringBuilder();
        File file = new File("src/com/company/files/" + fileName);
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(file)))
        {
            for(String line; (line = br.readLine()) != null; )
            {
                //System.out.println(line);
                //line = line.replace(" " , "");
                //System.out.println(line);
                stringStorage.append(line + " ");
            }
            // line is not visible here.
        } catch (IOException e)
        {
            e.printStackTrace();

        }
        //System.out.println(stringStorage.toString());
        return stringStorage.toString();
    }

    public LinkedList stringBuilderOp(String operandsFile)
    {
        StringBuilder stringStorage = new StringBuilder();
        LinkedList operandsFileList = new LinkedList();
        File file = new File("src/com/company/files/" + operandsFile);
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(file)))
        {
            for(String line; (line = br.readLine()) != null; )
            {
                //System.out.println(line);
                //line = line.replace(" " , "");
                //System.out.println(line);
                stringStorage.append(line + " ");
            }

            //System.out.println(stringStorage.toString() + "\n");
            Scanner scan = new Scanner(stringStorage.toString());
            // make the LinkedList
            //Operand operandNode = new Operand();

            while (scan.hasNext())
            {
                Operand operandNode = new Operand();
                operandNode.setVariable(scan.next());
                operandNode.setValue(scan.nextDouble());
                //System.out.println(scan.nextDouble());
                operandsFileList.insertBack(operandNode);

            }
            //System.out.println("Out");
            //System.exit(1);
            // line is not visible here.
        } catch (IOException e)
        {
            e.printStackTrace();

        }
        return operandsFileList;
    }
}
