import java.util.Scanner;
public class LuanaAssisSilva_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um valor para A: ");
        int  a = teclado.nextInt();
        System.out.print(" Informe um valor para B: ");
        int b = teclado.nextInt();
        int resto;
        do {
            resto = a%b;
            a = b;
            b = resto;
        } while (resto!=0);
        System.out.println("O m.d.c. é " + a );
    }
}
