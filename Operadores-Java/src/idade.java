import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Para acessar o seguinte site, digite sua idade...");
        var resultado = scanner.nextInt();
        var idade = resultado >= 18; // verifica se o resultado é maior ou igual a 18
        System.out.printf("Você pode acessar o site? (%s) \n", idade);
    }
}
