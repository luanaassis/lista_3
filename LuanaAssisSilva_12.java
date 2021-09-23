import java.util.Scanner;
public class LuanaAssisSilva_12 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String maiorAcidenteCidade  = "", menorAcidenteCidade  = "";
        int count =0;
        double maiorAcidente = -99999999, menorAcidente = 9999999, soma = 0, mediaVeiculos =0, mediaD=0, mediaAcidentes =0, mediaB =0;
        for (int i=0;i<5; i++){
            System.out.println("Informe o nome da cidade: ");
            String cidade = teclado.nextLine();
            System.out.println("Informe o número de veículos: ");
            int veiculos = Integer.parseInt(teclado.nextLine());
            System.out.println("Informe o número de acidentes: ");
            int acidentes = Integer.parseInt(teclado.nextLine());
            mediaVeiculos  +=  veiculos;
            mediaAcidentes +=  acidentes;
            if(acidentes>maiorAcidente) {
                maiorAcidente = acidentes;
                maiorAcidenteCidade=cidade;
            }
            else if (acidentes<menorAcidente){
                menorAcidente = acidentes;
                menorAcidenteCidade=cidade;
            }
            if (veiculos<200){
                mediaD=+ acidentes;
                count ++;
            }
            mediaB= mediaAcidentes/mediaVeiculos;
        }
        System.out.println("O maior número de acidentes é "+ maiorAcidente + ",  na  cidade "+maiorAcidenteCidade);
        System.out.println("O menor número de acidentes é "+ menorAcidente + ",  na  cidade "+menorAcidenteCidade);
        System.out.println("A média de acidentes em cidades com menos de 200 veículos é: "+ (mediaD/count));
        System.out.println("A razão de acidentes/veículos nas 5  cidades é de " + mediaB);
        System.out.println(" A média de veículos nas cidades é de " + (mediaVeiculos/5));
    }
}
