import java.util.Scanner; //importa a biblioteca scanner do Java

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // pode usar var (variavel) alternativamente
        System.out.println("Olá, informe seu nome:");
        String nome = scanner.next(); // pode usar var (variavel) alternativamente
        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt(); // pode usar var (variavel) alternativamente
        System.out.printf("Olá, " + nome + " sua idade é " + idade);
        //System.out.printf("Olá %s sua idade é %s \n", nome, idade); código alternativo que funciona de maneira semelhante,
        // precisa usar \n pois printf não possui, diferente de printnl
    }
}
