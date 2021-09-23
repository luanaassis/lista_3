import java.util.Scanner;
public class LuanaAssisSilva_15 {
    public static void main(String[] args){
        int num1 = 1, num2 = 0, aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número : ");
        int n = Integer.parseInt(teclado.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println(num1);
            aux = num1;
            num1 = num1 + num2;
            num2 = aux;
        }
    }
}
