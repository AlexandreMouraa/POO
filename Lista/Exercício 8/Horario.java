public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public Horario(int hora, int minuto, int segundo) {
        if (validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo.");
        }
    }

    public void atualizarHora(int hora) {
        if (validarHora(hora)) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Valor inválido para hora.");
        }
    }

    public void atualizarMinuto(int minuto) {
        if (validarMinuto(minuto)) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Valor inválido para minuto.");
        }
    }

    public void atualizarSegundo(int segundo) {
        if (validarSegundo(segundo)) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Valor inválido para segundo.");
        }
    }

    public void atualizarHorario(int hora, int minuto, int segundo) {
        if (validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Valores inválidos para hora, minuto ou segundo.");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHorarioCompleto() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public static int diferencaEmMinutos(Horario horario1, Horario horario2) {
        int totalSegundos1 = horario1.hora * 3600 + horario1.minuto * 60 + horario1.segundo;
        int totalSegundos2 = horario2.hora * 3600 + horario2.minuto * 60 + horario2.segundo;
        int diferencaSegundos = Math.abs(totalSegundos1 - totalSegundos2);
        return diferencaSegundos / 60;
    }

    private boolean validarHora(int hora) {
        return hora >= 0 && hora <= 23;
    }

    private boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto <= 59;
    }

    private boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo <= 59;
    }
}