package herança;
// Ao criar essa segunda classe e extender as caracteristicar da classe mae "Carro"
// eu consigo que apenas meu segundo objeto tenha uma peculiaridade ou seja algo nele seja difrente
// ele tem a mesma estrutura do primeiro objeto mas algo nele é diferente ele é um carro da mesma marca
// mesmo modelo e tipo de motor mas algo difrente como uma plotagem.


public class Diferenca extends Carro{
    public String plotagem;

    // aqui ja tratamos de polimorfismo que é reutilizar o mesmo metodo /funcao da nossa classe mãe mas
    // passando um parametro para ele.
    public void status(String tp){
        this.plotagem= tp;
        System.out.println("plotagem: "+ this.plotagem);

    }
}
