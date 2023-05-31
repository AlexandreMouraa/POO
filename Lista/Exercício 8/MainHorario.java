import java.util.Scanner;

public class MainHorario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora do primeiro horário: ");
        int hora1 = scanner.nextInt();
        System.out.print("Informe o minuto do primeiro horário: ");
        int minuto1 = scanner.nextInt();
        System.out.print("Informe o segundo do primeiro horário: ");
        int segundo1 = scanner.nextInt();

        System.out.print("Informe a hora do segundo horário: ");
        int hora2 = scanner.nextInt();
        System.out.print("Informe o minuto do segundo horário: ");
        int minuto2 = scanner.nextInt();
        System.out.print("Informe o segundo do segundo horário: ");
        int segundo2 = scanner.nextInt();

        Horario horario1 = new Horario(hora1, minuto1, segundo1);
        Horario horario2 = new Horario(hora2, minuto2, segundo2);

        System.out.println("Horário 1: " + horario1.getHorarioCompleto());
        System.out.println("Horário 2: " + horario2.getHorarioCompleto());

        int diferencaMinutos = Horario.diferencaEmMinutos(horario1, horario2);
        System.out.println("Diferença em minutos: " + diferencaMinutos);

        scanner.close();
    }
    
}
