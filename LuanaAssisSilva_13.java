import java.util.Scanner;
public class LuanaAssisSilva_13 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String resp  = "S";
        while (resp.equals("S")) {
            System.out.println("Informe um número :");
            int numero = Integer.parseInt(teclado.nextLine());
            if (numero % 2 == 0 || numero % 3 == 0 || numero%5 ==0) {
                if (numero == 2 || numero == 3 || numero == 5) {
                    System.out.println("O número é primo ");
                } else {
                    System.out.println("O número não é primo");
                }
            } else {
                System.out.println("O número é primo ");
            }
            System.out.println("Deseja testar mais um número? (S/N) ");
            resp = teclado.nextLine();
        }
    }
}
