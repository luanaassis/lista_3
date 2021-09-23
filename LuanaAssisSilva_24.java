import java.util.Scanner;
public class LuanaAssisSilva_24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numConsumidor = 1, codigo=0, count1=0, count2=0, consumo1 =0, consumo2=0;
        double qkw = 0, totalConsumo=0;
        while (numConsumidor != 0){
            System.out.println("Informe o número do consumidor : ");
            numConsumidor = teclado.nextInt();
            System.out.println("Informe o código do consumidor: ");
            codigo = teclado.nextInt();
            System.out.println("Quantos kWh durante o mês? ");
            qkw = teclado.nextDouble();
            totalConsumo += qkw;
            if (codigo == 1){
                consumo1+=qkw;
                System.out.println("O consumidor "+numConsumidor+ " deve pagar " + (qkw*0.3));
                count1++;
            } else if (codigo == 2){
                consumo2+=qkw;
                System.out.println("O consumidor "+numConsumidor+ " deve pagar " + (qkw*0.5));
                count2++;
            } else if (codigo == 3){
                System.out.println("O consumidor "+numConsumidor+ " deve pagar " + (qkw*0.7));
            }
        }
        System.out.println("O total de consumo foi de " + totalConsumo);
        System.out.println("A média dos tipos 1 e 2 foi de "+(consumo1+consumo2)/(count1+count2));

    }
}
