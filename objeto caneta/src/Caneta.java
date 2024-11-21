
public class Caneta {
   public String modelo;
   protected int carga;
//    protected float numeracao;
//    public String cor;
//    private boolean tampada;
//    um atributo privado pode ser moddificado apenas pela classe na qual ele foi criado.
//   public void estado(){
//        System.out.println("Modelo: " + this.modelo);
//        System.out.println("Carga: " + this.carga);
//        System.out.println("Numeracao: " + this.numeracao);
//        System.out.println("Cor: " + this.cor);
//        System.out.println("Tampada: " + this.tampada);
//    }
//    public void tampar(){
//        if(this.tampada == true);
//        System.out.println("posso escrever agora");
//    }

    //Outra forma de realizar esse processo só que será apenas uma vez e posso criar varios objetos a partir dele.
    public Caneta(String modelo, int carga) {
        this.modelo = modelo;
        this.carga = carga;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
       this.modelo = modelo;
    }
    public int getCarga() {
       return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void status(){
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Carga: "+this.getCarga());
    }
}

