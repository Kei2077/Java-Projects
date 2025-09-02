import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var valor = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var valor1 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", valor, valor1, valor + valor1);
        //System.out.println(valor + " + " + valor1 + " = " + (valor + valor1)); //maneira usando string
        System.out.printf("%s - %s = %s\n", valor, valor1, valor - valor1);
        System.out.printf("%s / %s = %s\n", valor, valor1, valor / valor1); // retorna somente com numero
        // inteiro 0.1 = 0, por ser int, logo para numeros quebrados, precisa mudar para float
        //var valor = scanner.nextFloat();
        System.out.printf("%s %% %s = %s\n", valor, valor1, valor % valor1); // retorna o resto da operacao
        System.out.printf("%s * %s = %s\n", valor, valor1, valor * valor1);
        System.out.printf("a raiz quadrada de %s = %s\n", valor, Math.sqrt(valor1));
        System.out.printf("a potencia de %s = %s\n", valor, Math.pow(valor1, 2));
        System.out.println("Informe o terceiro número:");
        var valor2 = scanner.nextInt();
        valor2 += 1;
        System.out.printf("A adicionando +1 ao terceiro numero = %s", valor2);
    }
}
