import java.util.Scanner;
public class LuanaAssisSilva_26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o ângulo em graus : ");
        double x = teclado.nextDouble();
        double sen = x ;
        int exp = 3,  fatorial =1;
        for (int i = 0; i<15; i++){
            if (i%2==0) {
                for (int j = exp; j > 0; j--) {
                    fatorial = j * fatorial;
                }
                sen += sen - (Math.pow(x, exp)/fatorial);
            } else{
                for (int j = exp; j > 0; j--) {
                    fatorial = j * fatorial;
                }
                sen += sen + (Math.pow(x, exp)/fatorial);
            }
        }
        System.out.println("O seno de x é " + sen);
    }
}