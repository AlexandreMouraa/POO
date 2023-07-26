package Arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4
{
    public static void main(String[] args) 
    {
        String arquivo = "deniro.csv";

        try (BufferedReader bf = new BufferedReader(
            new FileReader(arquivo)))
        {

            String line = "";
            while((line = bf.readLine()) != null)
            {
                String [] values = line.split(",");

                for(int i = 0; i < Math.min(3, values.length); i++)
                    System.out.print(values[i] + ",");

                System.out.println();
            }
        } catch (IOException e) 
        {
            // TODO: handle exception
            System.out.println("Nao foi possível ler o arquivo CSV" + e.getMessage());
        }
    }
}