/*(Pquena)Lista de exercícios que abrangem os conceitos de encapsulamento, herança e polimorfismo em Java:

1 - Crie uma classe chamada Pessoa com os seguintes atributos privados: nome, idade e endereco. Implemente os métodos de acesso (getters) e de modificação (setters) para esses atributos.

2 - Crie uma classe chamada Funcionario que herda da classe Pessoa. Adicione um atributo adicional chamado cargo à classe Funcionario e implemente os métodos de acesso e modificação para esse atributo.

3 - Crie uma classe chamada Gerente que herda da classe Funcionario. Adicione um atributo adicional chamado setor à classe Gerente e implemente os métodos de acesso e modificação para esse atributo.

4 - Crie uma classe chamada Animal com um atributo privado chamado nome. Implemente um método chamado emitirSom() que imprime uma mensagem genérica.

5 - Crie classes específicas para cada tipo de animal (por exemplo, Cachorro, Gato, Pato) que herdam da classe Animal. Implemente o método emitirSom() em cada classe específica para que ele imprima um som característico de cada animal.

6 - Crie uma classe chamada Forma com um método calcularArea() que retorna um valor double.

7 - Crie classes específicas para cada tipo de forma (por exemplo, Circulo, Quadrado, Triangulo) que herdam da classe Forma. Implemente o método calcularArea() em cada classe específica para calcular a área correspondente.

8 - Crie uma classe chamada Veiculo com atributos privados como marca, modelo e ano. Implemente os métodos de acesso e modificação para esses atributos.

9 - Crie classes específicas para cada tipo de veículo (por exemplo, Carro, Moto, Caminhao) que herdam da classe Veiculo. Adicione atributos específicos para cada classe (por exemplo, numPortas para Carro, cilindrada para Moto) e implemente os métodos de acesso e modificação correspondentes.

10 - Crie uma classe chamada Banco com um método calcularTaxaJuros() que retorna um valor double.

11 - Crie classes específicas para cada tipo de banco (por exemplo, BancoA, BancoB, BancoC) que herdam da classe Banco. Implemente o método calcularTaxaJuros() em cada classe específica para calcular a taxa de juros correspondente.*/


public class Employee
{
    private String nome;
    private int idade;
    private String endereco;

    public Employee(String nome, int idade, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public String getEndereco() 
    {
        return endereco;
    }
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    @Override
    public String toString()
    {
        return " Seu nome é: " + nome + "\nSua idade é: " + idade + "\nLocal de sua residência: " + endereco;
    }
    
}

class Funcionario extends Employee
{
    private String Cargo;

    public Funcionario(String nome, int idade, String endereco, String Cargo)
    {
        super(nome, idade, endereco);
        this.Cargo = Cargo;
    }

    public String getCargo() 
    {
        return Cargo;
    }

    public void setCargo(String cargo) 
    {
        Cargo = cargo;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Seu cargo é:" + Cargo;
    }

}

class Gerente extends Employee
{
    private String setor;

    public Gerente(String nome, int idade, String endereco, String setor)
    {
        super(nome, idade, endereco);
        this.setor = setor;
    }

    public String getSetor() 
    {
        return setor;
    }

    public void setSetor(String setor) 
    {
        this.setor = setor;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "O seu cargo é: " + setor;
    }
    
}

///Primeira Parte do código, até a questão 3.

//Questão 4 e 5 agora

class Animal
{
    private String nome;

    public Animal(String nome)
    {
        this.nome = nome;
    }

    public String emitirSom()
    {
        return "Emitindo SOM...";
    }
}

class Cachorro extends Animal
{
    public Cachorro(String nome)
    {
        super(nome);
    }

    @Override
    public String emitirSom() 
    {
        return super.emitirSom() + "Latindo";
    }
}

class Gato extends Animal
{
    public Gato(String nome)
    {
        super(nome);
    }

    @Override
    public String emitirSom() 
    {
        return super.emitirSom() + "Miando";
    }
}

class Pato extends Animal
{
    public Pato(String nome)
    {
        super(nome);
    }

    @Override
    public String emitirSom() 
    {
        return super.emitirSom() + "Quack";
    }
}

class Forma
{
    public double calcularArea(double valor)
    {
        return valor;
    }
}

class Circulo extends Forma
{
    
    public double calcularAreaCirculo(int value)
    {
        return super.calcularArea(3.14)* Math.pow(value, 2);
    }
}

class Triangulo extends Forma
{
    
    public double calcularAreaTriangulo(int value)
    {
        return super.calcularArea(3.14) * Math.pow(value, 2);
    }
}

class Quadrado extends Forma
{
    
    public double calcularAreaQuadrado(int value)
    {
        return super.calcularArea(3.14)* Math.pow(value, 2);
    }
}

