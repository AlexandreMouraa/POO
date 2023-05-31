public class Nr1 {

    public static void main(String[] args) {

        //EXERCÍCIO NúMERO 1
        System.out.println("Exercício nr 1:");
        System.out.println();
        Students Aluno1 = new Students("Alexandre");
        Aluno1.matricular(202885419, "Sistemas de Informação", 2015);

        System.out.println(Aluno1.toString());

        Aluno1.setCurso("Eng. de Software");
        Aluno1.setAno(2022);

        System.out.println(Aluno1.toString());
        System.out.println();
        System.out.println("Exercício nr 2:");
        System.out.println();

        /////////////////////////////////////////////

        //EXERCÍCIO NÚMERO 2
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
        System.out.println(alu1.getCurso().toString());
    }
    
}
