import java.util.Scanner;

public class MainFilme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Cadastro de Filmes ===");
        System.out.println("Digite o código do filme (0 para sair):");
        int codigo = scanner.nextInt();
        
        while (codigo != 0) {
            System.out.println("Digite o nome do filme:");
            String nome = scanner.next();

            Filme filme = new Filme(codigo, nome);
            
            System.out.println("Digite o gênero do filme:");
            String genero = scanner.next();
            filme.setGenero(genero);
            
            System.out.println("Digite o ano do filme:");
            int ano = scanner.nextInt();
            filme.setAno(ano);
            
            System.out.println("Digite o autor principal do filme:");
            String autorPrincipal = scanner.next();
            filme.setAutorPrincipal(autorPrincipal);
            
            System.out.println("Filme cadastrado:");
            System.out.println(filme.toString());
            
            System.out.println("Digite o código do filme (0 para sair):");
            codigo = scanner.nextInt();
        }
        
        System.out.println("Total de filmes criados: " + Filme.getTotalFilmes());
    }
    
}
