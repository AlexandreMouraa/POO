public class Nr2 
{
    public static void main(String [] args)
    {
        Students2 alu1 = new Students2("Alexandre", 5622541, 26);

        //Feito na mão mesmo para costume, poderia ter criado um objeto Curse e feito isso,
        //papra costume optei por essa opção
        alu1.getCurso().setNome("Engenharia de Software");
        alu1.getCurso().setDuracao(5);
        alu1.getCurso().setAno(2023);

        System.out.println(alu1.toString());
        System.out.println();
        System.out.println(alu1.getCurso().toString());

        //Alteração requisitada pelo exercício
        alu1.getCurso().setNome("Sistemas de Informação");
        alu1.getCurso().setAno(2024);


        System.out.println(alu1.toString());
        System.out.println();
        System.out.println(alu1.getCurso().toString());
    }
    
}
