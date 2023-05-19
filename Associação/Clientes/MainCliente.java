public class MainCliente 
{
    public static void main(String[] args) {
        Enderecoo endereco1 = new Enderecoo("Rua A", 123, "Apto 123", "12345-678", "Centro", "São Paulo", "SP");
        Cliente cliente1 = new Cliente("João da Silva", "123.456.789-00", endereco1);

        Enderecoo endereco2 = new Enderecoo("Rua B", 456, "", "98765-432", "Jardim", "Campinas", "SP");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", endereco2);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
    
}
