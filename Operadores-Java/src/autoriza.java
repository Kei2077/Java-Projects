import java.util.Scanner;

public class autoriza {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("digite sua renda familiar...");
        var resultado = scanner.nextInt();
        System.out.println("Faz parte de algum grupo de minoria social?");
        var grupo = scanner.nextBoolean();
        var autoriza = resultado <= 2500 || grupo; // verifica se o resultado é maior ou igual a 18
        // ou faz parte de algum grupo
        System.out.printf("Você pode acessar o beneficio? (%s) \n", autoriza);
    }
}
