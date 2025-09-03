import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o tamanho do primeiro lado (em cm):");
        var lado = scanner.nextFloat();
        System.out.println("Insira o tamanho do segundo lado (em cm):");
        var lado2 = scanner.nextFloat();
        var area = lado * lado2;
        System.out.printf("A área é %s \n", area);
    }
}
