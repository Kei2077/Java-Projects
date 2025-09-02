import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var valor = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var valor1 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", valor, valor1, valor + valor1);
    }
}
