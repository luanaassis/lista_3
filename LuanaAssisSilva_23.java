public class LuanaAssisSilva_23 {
    public static void main(String[] args) {
        double distancia= 400,  kmA =0 , hrs = 0;
        while (kmA<distancia){
            kmA = kmA + (30*3.6);
            distancia = distancia - (40*3.6);
            hrs++;
        }
        System.out.println(" Eles vão se cruzar depois de "+hrs+" horas.");
        System.out.println("A distância a ser percorrida por A é de "+ kmA);
        System.out.println("A distância a ser percorrida por B é de "+ (400-distancia));
    }
}