package Arquivo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

//Write a Java program that reads the content of a text file and displays it on the console.

public class Exercise1 
{
    
    public static void main(String[] args) 
    {
        String arquivoDeEntrada = "arquivo.txt";

        try(BufferedReader read = new BufferedReader(
            new InputStreamReader(new FileInputStream(arquivoDeEntrada), "UTF-8"))) 
        {

            String line = read.readLine();
            while(line != null)
            {
                System.out.println(line);
                line = read.readLine();
            }
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Não foi possível ler o arquivo: " + e.getMessage());
        }
    }
}
