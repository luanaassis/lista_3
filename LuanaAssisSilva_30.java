public class LuanaAssisSilva_30 {
    public static void main(String[] args) {
        double ingresso = 120, custoFixo = 200, lucro = 0, lucrom=0, ingressom=0, preco=0;
        for ( double valor = 5; valor>=1; valor-=0.5){
            lucro =  ingresso*valor - custoFixo;
            ingresso += 26 ;
            if (lucro>lucrom){
                lucrom = lucro;
                ingressom = ingresso;
                preco = valor;
            }
            System.out.println("Valor do ingresso: "+valor+ ", lucro: "+lucro);
        }
        System.out.println("Lucro  máximo é de "+lucrom+" com "+ingressom+"  ao preço de "+ preco);
    }
}
