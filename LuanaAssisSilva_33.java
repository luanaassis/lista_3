import java.util.Scanner;
public class LuanaAssisSilva_33 {
        public static void main(String args[]) {
            Scanner teclado = new Scanner(System.in);
            System.out.print(" Informe um CPF : ");
            String cpf = (teclado.nextLine());
            String cpfV[] = cpf.split("");
            int valorCPF[] = new int[11];
            for (int i = 0; i < 11; i++) {
                valorCPF[i] = new Integer(cpfV[i]);
            }
            if (valorCPF.length == 11){
                int num = 10;
                int soma = 0;
                for (int i = 0; i < 9; i++) {
                    soma = soma + valorCPF[i] * num;
                    num = num - 1;
                }            soma = soma % 11;
                if (11 - soma < 2 && valorCPF[9] != 0) {
                    System.out.println(" O CPF é inválido.");
                } else {
                    num = 11;
                    soma = 0;
                    for (int i = 0; i < 10; i++) {
                        soma = soma + valorCPF[i] * num;
                        num = num - 1;
                    }
                    soma = soma % 11;
                    if (11 - soma < 2 && valorCPF[10] != 0) {
                        System.out.println(" O CPF é inválido.");
                    } else {
                        System.out.println(" O CPF é válido.");
                    }
                }
            } else {
                System.out.println(" O CPF é inválido.");
            }
        }
}

