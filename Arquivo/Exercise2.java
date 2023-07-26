package Arquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exercise2 
{
    public static void main(String[] args) 
    {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas frases vai querer escrever? ");
        int size = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Agora escreva as frases:");
        String [] frases = new String[size];

        for(int i = 0; i < size; i++)
            frases[i] = leitor.nextLine();
        
        String arquivoDeSaida = "arquivo2.txt";

        leitor.close();

        try (BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream(arquivoDeSaida), StandardCharsets.UTF_8)))
        {
            for(String phrases : frases)
            {
                writer.write(phrases);
                writer.newLine();
            }
            System.out.println("Cheguei aqui, as frases foram escritas com sucesso!!!");   

        } catch (IOException e) 
        {
           // TODO: handle exception
           System.out.println("Não foi possível escrever o arquivo:" + e.getMessage());
        }    
    }   
}
