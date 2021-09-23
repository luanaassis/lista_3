import java.util.Scanner;
public class LuanaAssisSilva_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um número inteiro  de 3 dígitos: ");
        int num = Integer.parseInt(teclado.nextLine());
        String numero = new String(String.valueOf(num));
        String numInv = "";
        String vetor[] = numero.split("");
        int p = vetor.length - 1;
        for (int i = 0; i < vetor.length; i++) {
            numInv = numInv + vetor[p];
            p  = p--;
        }
        if (numero.equals(numInv)) {
            System.out.print (" É um palíndromo");
        } else {
            System.out.print(" Não é um palíndromo");
        }
    }
}
