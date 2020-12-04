public class Principal {

    public static void main(String[]args){
        Carro carro = new Carro("Prata", "Hrv", "4","Honda","2020");
        carro.imprimeItensObrigatorias();
        carro.imprimeItensOpcionais();
    }
}
