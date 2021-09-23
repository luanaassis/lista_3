import java.util.Scanner;
public class LuanaAssisSilva_9 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String resp = "S";
        double soma = 0;
        int count = 0;
        while (resp.equals("S")){
            System.out.println("Informe um número: ");
            double numero = Double.parseDouble(teclado.nextLine());
            soma = soma + numero;
            System.out.println(" Deseja adicionar mais um número? S/N ");
            resp = teclado.nextLine();
            count ++;
        }
        System.out.println("A soma é " + soma);
        System.out.println("A média é " + soma/count);
    }
}