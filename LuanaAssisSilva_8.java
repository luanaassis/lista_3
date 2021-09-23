import java.util.Scanner;
public class LuanaAssisSilva_8 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe até qual número: ");
        int  n = Integer.parseInt(teclado.nextLine());
        double soma = 0;
        double i = 1;
        while (i<=n) {
            if (i%2==0){
                soma = soma - (1/i);
            } else {
                soma = soma + (1/i);
            }
            i++;
        }
        System.out.println("A soma é " + soma);
    }
}

