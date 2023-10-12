import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda-feira";
                break;
            case 3:
                dia = "terça-feira";
                break;
            case 4:
                dia = "quarta-feira";
                break;
            case 5:
                dia = "quinta-feira";
                break;
            case 6:
                dia = "sexta-feira";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inexistente tente digitar de 1 a 7!";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();

    }
}
