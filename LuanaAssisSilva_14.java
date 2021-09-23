import java.util.Scanner;
public class LuanaAssisSilva_14 {
        public static void main(String args[]) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Informe um número para o fatorial : ");
                int numero = Integer.parseInt(teclado.nextLine());
                int resultado = 1;
                for (int i = numero; i > 0;i--){
                        resultado = i * resultado ;
                }
                System.out.println("O fatorial de "+numero+ " é, "+ resultado);
        }
}
