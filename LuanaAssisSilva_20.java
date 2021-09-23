import java.util.Scanner;
public class LuanaAssisSilva_20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double resp = 1, mediaPar = 0, mediaImpar = 0, maiorPar=-99999999, menorImpar=9999999;
        int count1 = 0, count2 =0;
        while (resp>0) {
            System.out.println("Informe o número : ");
            double numero = Double.parseDouble(teclado.nextLine());
            resp = numero;
            if (resp > 0) {
                if (numero % 2 == 0) {
                    mediaPar += numero;
                    count1++;
                    if (numero > maiorPar) {
                        maiorPar = numero;
                    }
                } else {
                    mediaImpar += numero;
                    count2++;
                    if (numero < menorImpar) {
                        menorImpar = numero;
                    }
                }
            }
        }
        System.out.println("A média dos números pares é de "+ (mediaPar/count1));
        System.out.println("A média dos números ímpares é de "+ (mediaImpar/count2));
        System.out.println("O maior número PAR é " + maiorPar);
        System.out.println("O menor número ÍMPAR é " + menorImpar);
    }
}
