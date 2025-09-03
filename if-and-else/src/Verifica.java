import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, digite seu nome:");
        var nome = scanner.next();
        System.out.printf("Olá, %s poderia digitar sua idade?\n", nome);
        var idade = scanner.nextInt();
        System.out.println("Você tem verificação facial?");
        var facial = scanner.next().equalsIgnoreCase("s");
        if ((idade >= 18 && facial)) {
            System.out.printf("%s, você pode acessar o sistema.. \n", nome);
        } else {
            System.out.println("ACESSO NEGADO!");
        }

    }
}
