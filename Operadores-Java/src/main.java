import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2000 + 77?");
        var resultado = scanner.nextInt();
        var errou = resultado != 2077; // verifica se errou, se o resultado é diferente 2077
        System.out.printf("O resultado é 2077, acertou? (%s) \n", !errou); // caso tenha errado vai ficar true,
        // logo precisa inverter com !
    }
}
