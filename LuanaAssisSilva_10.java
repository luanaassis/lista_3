import java.util.Scanner;
public class LuanaAssisSilva_10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String resp = "S";
        double maior = -99999999, menor = 9999999;
        while (resp.equals("S")){
            System.out.println("Informe um número: ");
            double numero = Double.parseDouble(teclado.nextLine());
            if(numero>maior) {
                maior = numero;
            }
            else if (numero<menor){
                menor = numero;
            }
            System.out.println(" Deseja adicionar mais um número? S/N ");
            resp = teclado.nextLine();
        }
        System.out.println("O maior número é "+ maior);
        System.out.println("O menor número é "+ menor);
    }
}
