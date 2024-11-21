
public class Main {
    public static void main(String[] args) {
//        Caneta caneta= new Caneta();
//        caneta.carga= 90;
//        caneta.modelo="bic";
//        caneta.cor="black";
//        caneta.numeracao =0.05f;
//        //caneta.tampada= true; seria possivel acessara a variavel tampada usando o metodo "caneta.setTampada(true)"
//        caneta.estado();
//        caneta.tampar();
        Caneta caneta1= new Caneta("bic",90);
        caneta1.status();
        System.out.println("/// CANETA 2///");
        Caneta caneta2= new Caneta("john",95);
        caneta1.status();
    }
}

