import java.util.Scanner;
public class LuanaAssisSilva_27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String h = "#";
        System.out.println("Informe o número: ");
        int num = teclado.nextInt();
        for (int j = 0; j < num; j++) {
            System.out.println(h);
            h = h + "#";
        }
    }
}

