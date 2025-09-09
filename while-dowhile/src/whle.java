import java.util.Scanner;

 class whle {
     public static void main(String[] args) {
         var scanner = new Scanner(System.in);
         var name = "";
         while (!name.equalsIgnoreCase("sair")){
             System.out.println("Informe nome");
             name = scanner.next();
             System.out.println(name);
         }
     }
}
