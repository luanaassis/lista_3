public class LuanaAssisSilva_22 {
    public static void main(String[] args) {
        double populacaoA = 500000, populacaoB = 700000;
        int anos=0;
        while (populacaoA<populacaoB){
            populacaoA = (populacaoA + (populacaoA*0.03));
            populacaoB = (populacaoB + (populacaoB*0.02));
            anos++;
        }
        System.out.println("A cidade A vai ultrapassar a cidade B em  "+(2015+anos));
    }
}
