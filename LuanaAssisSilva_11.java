import java.util.Scanner;
public class LuanaAssisSilva_11 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String resp = "S";
        int count  = 0;
        double maior = -99999999, menor = 9999999, soma = 0, media =0;
        String menornome="",maiornome="";
        while (resp.equals("S")){
            System.out.println("Informe a nota: ");
            double nota = Double.parseDouble(teclado.nextLine());
            System.out.println("Informe o nome do aluno: ");
            String nome = teclado.nextLine();
            soma += nota;
            if(nota>maior) {
                maior =nota;
                maiornome=nome;
            }
            else if (nota<menor){
                menor = nota;
                menornome=nome;
            }
            count = count +1;
            System.out.println(" Deseja adicionar mais um número? S/N ");
            resp = teclado.nextLine();
            media = soma/count;
        }
        System.out.println("O maior número é "+ maior + ",  do alun@ "+maiornome);
        System.out.println("O menor número é "+ menor + ",  do alun@ "+menornome);
        System.out.println("A soma das notas é " + soma);
        System.out.println("A média das notas é "+media);
    }
}
