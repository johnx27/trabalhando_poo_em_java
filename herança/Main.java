package herança;

public class Main {
    public static void main(String[] args){

        Carro carro1= new Carro();
        System.out.println("CARRO UM:");
        carro1.Tipomotor="v8";
        carro1.marca="chevrolet";
        carro1.modelo="chevet";
        carro1.status();


        Diferenca carro2= new Diferenca();
        System.out.println("CARRO DOIS:");
        carro2.marca="cahevrolet";
        carro2.modelo= "camaro";
        carro2.Tipomotor= "v8";
        carro2.status("vermelha");
        carro2.status();
    }
}
