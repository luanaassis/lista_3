import java.util.Scanner;
public class LuanaAssisSilva_6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe até qual número: ");
        int  n = Integer.parseInt(teclado.nextLine());
        int soma = 0;
        for (int  i = 1; i<=n; i++){
            soma = soma + i;
        }
        System.out.println("A soma é " + soma);
        System.out.println("A média é " + soma/n);
    }
}
