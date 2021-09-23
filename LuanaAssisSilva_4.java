import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static void main(String args[]) {
        double i = 0;
        Scanner teclado = new Scanner(System.in);
        while (i!=-999){
            System.out.print(" Para sair digite -999. ");
            System.out.println("Informe um número: ");
            i = Double.parseDouble(teclado.nextLine());
            if (i!=-999) {
                System.out.print(" O triplo é " + 3 * i);
            }
        }
    }
}
