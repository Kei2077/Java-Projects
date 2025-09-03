import java.util.Scanner;

public class dif_idades {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Usuario 1, insira seu nome:");
        var nome = scanner.next();
        System.out.printf("%s, insira sua idade:\n", nome);
        var idade = scanner.nextInt();
        System.out.println("Usuario 2, insira seu nome:");
        var nome1 = scanner.next();
        System.out.printf("%s, insira sua idade:\n", nome1);
        var idade1 = scanner.nextInt();
        var dif = idade - idade1;
        System.out.printf("a diferença entre as idades de %s e %s é: %s \n", nome, nome1, dif);


    }
}
