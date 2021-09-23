import java.util.Scanner;
public class LuanaAssisSilva_29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de A : ");
        int a = teclado.nextInt();
        System.out.println("Informe o valor de B : ");
        int b = teclado.nextInt();
        int aux, quociente =0;
        aux = a;
        while (a>=b){
            a-=b;
            quociente++;
        }
        System.out.println("O quociente é " + quociente + " e o resto é "+ a);
    }
}
