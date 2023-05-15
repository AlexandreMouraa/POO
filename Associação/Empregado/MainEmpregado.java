public class MainEmpregado 
{
    public static void main(String[] args) {
        // Criando endereços
        Endereco endereco1 = new Endereco("Rua A", 123, "Apto 1", "12345-678", "Bairro A", "Cidade A", "Estado A");
        Endereco endereco2 = new Endereco("Rua B", 456, null, "23456-789", "Bairro B", "Cidade B", "Estado B");
        
        // Criando empresas
        Empresa empresa1 = new Empresa("12.345.678/0001-01", "Empresa A", endereco1);
        Empresa empresa2 = new Empresa("98.765.432/0001-02", "Empresa B", endereco2);
        
        // Criando empregados
        Empregado empregado1 = new Empregado("João", 1111, empresa1);
        Empregado empregado2 = new Empregado("Maria", 2222, empresa2);
        Empregado empregado3 = new Empregado("Pedro", 3333, empresa1);
        
        // Exibindo empregados e suas empresas
        System.out.println("Empregado 1: " + empregado1);
        System.out.println("Empresa 1: " + empregado1.toString());
        System.out.println();
        
        System.out.println("Empregado 2: " + empregado2);
        System.out.println("Empresa 2: " + empregado2.toString());
        System.out.println();
        
        System.out.println("Empregado 3: " + empregado3);
        System.out.println("Empresa 1: " + empregado3.toString());
        System.out.println();
    }
    
}
