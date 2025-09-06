import java.util.Scanner;

public class repete {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (;;){ // com ;; a repetição fica infinita
            System.out.println("Digite um nome:");
            var nome = scanner.next();
            if (nome.equalsIgnoreCase("sair")) break; //quando digitar sair sai do loop de repeat
            System.out.println(nome);

        }
        var numero = 0; // não precisa se usar o exemplo no comentario abaixo
        for (;numero <= 100;numero ++){ //ou for (var numero = numero;numero < 100;numero ++){
            //precisa  colocar <= pois só < só conta até 99
            System.out.println(numero); // conta de 0 a 100 e para, depois de digitar exit
            if (numero == 100){
                System.out.println("-Fim da ordem crescente!");
            }
        }

        for (var numero1 = 150;numero1 >= 0;numero1--){ //contar em ordem descrecente
            System.out.println(numero1);
            if (numero1 == 0){
                System.out.println("-Fim da ordem descrecente!");
            }
        }
        for (var numero2 = 0;numero2 <= 100;numero2++){
            if (numero2 % 2 == 0){ //se o numero for divisivel por 2, ignorar na contagem
                continue;
            }
            System.out.println(numero2);
            if (numero2 == 99){
                System.out.println("-fim da ordem crescente, ignorando números divisiveis por 2!");
            }
        }
        for (var numero3 = 0;numero3 < args.length;numero3++){ //lista os argumentos do java por cada linha. um por um
            System.out.println(numero3 + " - " + args[numero3]);
            if (numero3 == 3) {
                System.out.println("-fim da listagem de argumentos!");
            }
        }

    }
}
