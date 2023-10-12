import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda-feira";
            case 3 -> "terça-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sábado";
            default -> "valor inexistente tente digitar de 1 a 7!";
        };

        System.out.println("Dia da semana: " + dia);
        sc.close();

    }
}
