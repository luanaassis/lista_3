import java.util.Scanner;
public class LuanaAssisSilva_16 {
    public static void main(String args[]) {
        int binario, a, bit, decimal = 0, exp = 0, octal=1, r, multi = 1, hexa = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número em binário : ");
        binario = teclado.nextInt();
        while (binario != 0 ){
            bit = binario%10;
            if (bit!=0 ||  bit!=1){
                break;
            }
            else {
                binario /= 10;
                decimal += bit * Math.pow(2, exp);
                exp++;
            }
        }
        System.out.println("Em decimal é "+decimal);
        while (decimal!=0){
            r = decimal%8;
            decimal= decimal/8;
            octal = octal*r;
        }
        System.out.println("Em octal é "+octal);
        while (octal!=0){
            r= octal% 16;
            octal = octal/16;
            hexa = hexa * r;
        }
        System.out.println("Em hexadecimal é "+ hexa);
    }
}
