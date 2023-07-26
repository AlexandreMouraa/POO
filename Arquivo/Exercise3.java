package Arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3
{
    public static void main(String[] args) 
    {

        String line = "";
        String longestsLine = "";

        String arquivoDeEntrarda = "arquivo.txt";
        try (BufferedReader obs = new BufferedReader(
            new FileReader(arquivoDeEntrarda)))
        {
            while((line = obs.readLine()) != null)
            {
                String [] words = line.split(" ");

                for(String wordss : words)
                {
                    if(wordss.length() > longestsLine.length())
                        longestsLine = wordss;
                }
            }

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }    
    }
}