import java.util.Scanner;


public class semana {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um numero de 1 a 7");
        var opcao = scanner.nextInt();
        var mensagem = switch (opcao){
            case 1, 7 -> { //caso seja sabado (7) ou domingo (1)
                var dia = opcao == 1 ? "Domingo" : "Sábado"; //fala se for 1 é domingo
                // ou se é outro número é sábado para variavel dia
                yield String.format("Hoje é %s, final de semana", dia);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Inválida";
        };
        System.out.println(mensagem);
    }
}
