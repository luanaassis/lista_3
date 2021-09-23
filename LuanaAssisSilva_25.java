import java.util.Scanner;
public class LuanaAssisSilva_25 {
    public static void main(String args[]) {
        double s = 0, den = 1;
        for (int i=1; i <= 51;i++){
            if (i%2==0){
                s -= (1/(Math.pow(den,3)));
            } else{
                s += (1/(Math.pow(den,3)));
            }
            den +=2;
        }
        System.out.println(" O valor de PI é : " + Math.cbrt(s*32));
    }
}
