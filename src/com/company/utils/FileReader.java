package com.company.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * Created by fili_ on 10/18/2016.
 */
public class FileReader
{
    public static String lineSplit(String fileName)
    {
        File file = new File("src/com.company/files/" + fileName);
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(file)))
        {
            for(String line; (line = br.readLine()) != null; )
            {
                System.out.println(line);
            }
            // line is not visible here.
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return " ";
    }
}
