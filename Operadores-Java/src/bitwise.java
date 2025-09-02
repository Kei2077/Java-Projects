public class bitwise {

    public static void main(String[] args) {
        var valor = 12;
        var binario = Integer.toBinaryString(valor);
        System.out.printf("1º número %s em binario %s\n", valor, binario);
        var valor1 = 10;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("2º número %s em binario %s\n", valor1,binario1);
        var resultado = valor | valor1;
        var resultado_binario = Integer.toBinaryString(resultado);
        var resultado1 = ~valor;
        var resultado_binario1 = Integer.toBinaryString(resultado1);
        var resultado2 = valor << valor1;
        var resultado_binario2 = Integer.toBinaryString(resultado2);
        System.out.printf("%s ^ %s = %s. em binario %s\n", valor, valor1, resultado, resultado_binario);
        System.out.printf("~%s = %s = %s. em binario %s\n", valor, valor1, resultado1, resultado_binario1);
        System.out.printf("~%s << %s = %s. em binario %s\n", valor, valor1, resultado2, resultado_binario2);
    }
}
