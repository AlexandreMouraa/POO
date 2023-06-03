//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
public class Kata
{
    public static String reverseWords(final String original)
    {
        // Have at it
        String [] words = original.split(" "); // Divide a frase em palavras usando o espaço como separador
        StringBuilder str = new StringBuilder();

        for(String word : words)
        {
            String reversedword = reverseString(word); // Inverte cada palavra individualmente
            str.append(reversedword).append(" "); // Adiciona a palavra invertida e um espaço ao StringBuilder
        }

        return new String(str).trim(); // Retorna a frase invertida removendo qualquer espaço extra no início ou no final
    }

    private static String reverseString(String str)
    {
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            reversed.append(ch);
        }

        return new String(reversed);
    }
}