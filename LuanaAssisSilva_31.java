import java.util.Scanner;
public class LuanaAssisSilva_31 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1, 2, 3, 4: voto para os respectivos candidatos");
        System.out.println("5: voto em branco");
        System.out.println(" Outros valores: voto nulo");
        System.out.println("0 para finalizar ");
        System.out.println("Vote: ");
        int voto = teclado.nextInt();
        int cand1=0 , cand2=0, cand3=0, cand4=0, branco=0, nulo=0;
        while (voto!=0){
            if (voto == 1){
               cand1 ++;
            } else if (voto == 2) {
                cand2 ++;
            }else if (voto == 3) {
                cand3 ++;
            }else if (voto == 4) {
                cand4 ++;
            } else if (voto == 5) {
                branco ++;
            } else{
                nulo ++;
            }
            System.out.println("Vote: ");
            voto = teclado.nextInt();
        }
        System.out.println("Candidato 1 : " + cand1);
        System.out.println("Candidato 2 : " + cand2);
        System.out.println("Candidato 3 : " + cand3);
        System.out.println("Candidato 4 : " + cand4);
        System.out.println("Branco : " + branco);
        System.out.println("Nulos : " + nulo);
    }
}
