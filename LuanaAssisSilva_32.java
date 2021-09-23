public class LuanaAssisSilva_32 {
    public static void main(String args[]) {
        int i = 2, numPerfeito = 0, somaNum = 0;
        while (numPerfeito<5){
            for (int j = 1; j <= (i / 2); j++) {
                if (i % j == 0) {
                   somaNum += j;
                }
            }
            if (somaNum == i) {
                numPerfeito++;
                System.out.println(""+i+"");
            }
            i++;
        }
    }
}
