import java.util.Scanner;
public class LuanaAssisSilva_19 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0, soma  =0, count=0;
        while (numero!=-1){
            System.out.println("Informe um  número : ");
            numero = teclado.nextDouble();
            if (numero>0){
                soma += numero;
                count ++;
            }
        }
        System.out.println("A média dos números digitados é " + (soma/count));
    }
}