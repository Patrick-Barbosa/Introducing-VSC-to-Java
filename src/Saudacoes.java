public class Saudacoes {

    public static void Mensagem(int horaSemMinutos) {

        if (horaSemMinutos >= 0 && horaSemMinutos < 6) {
            System.out.println("Boa Madrugada!!");
        } else if (horaSemMinutos >=6 && horaSemMinutos <= 12) {
            System.out.println("Bom Dia!!");
        } else if (horaSemMinutos > 12 && horaSemMinutos < 18) {
            System.out.println("Boa Tarde!!");
        } else if (horaSemMinutos >=18 && horaSemMinutos <= 24) {
            System.out.println("Boa Noite!!");
        } else {System.out.println("Você digitou um horário inválido!");}
    }
}