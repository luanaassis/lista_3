import java.util.Scanner;
public class LuanaAssisSilva_28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int num = teclado.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(num+" x "+i+" é igual a " + (num*i));
        }
    }
}