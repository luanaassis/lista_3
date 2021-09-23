import java.util.Scanner;
public class LuanaAssisSilva_18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int operacao=0, num1, num2, result = 0;
        System.out.println("====================");
        System.out.println("Calculadora da Luana");
        System.out.println("====================");
        System.out.println("Opções:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 – Sair");
        System.out.println(" ====================");
        operacao = Integer.parseInt(teclado.nextLine());
        while (operacao!=5){
            System.out.println("Informe o primeiro número: ");
            num1 = Integer.parseInt(teclado.nextLine());
            System.out.println("Informe o segundo número: ");
            num2 = Integer.parseInt(teclado.nextLine());
            if (operacao == 1 ){
                result = num1 + num2;
            } else if (operacao == 2){
                result = num1 - num2;
            } else if (operacao == 3){
                result = num1 * num2;
            }else if (operacao == 4){
                result = num1 / num2;
            }
            System.out.println("O resultado da operação escolhida é : " + result);
            System.out.println("Digite uma nova opção da calculadora ");
            operacao = Integer.parseInt(teclado.nextLine());
        }
    }
}
