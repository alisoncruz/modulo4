public class Carro {

    private String cor;
    private String modelo;
    private String quantidadePortas;
    private String marca;
    private String ano;
    private boolean arCondicionado;
    private boolean cambioAutomatico;
    private boolean direcaoHidraulica;
    private boolean tetoSolar;

    public Carro(String cor, String modelo, String quantidadePortas, String marca, String ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.quantidadePortas = quantidadePortas;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro() {

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(String quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean arCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean cambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean direcaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean tetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void imprimeItensObrigatorias() {
        System.out.println("Itens obrigatórios" +
                "\nModelo: " + this.modelo +
                "\nMarca: " + this.marca +
                "\nAno: " + this.ano +
                "\nCor: " + this.cor +
                "\nPortas: " + this.quantidadePortas);
    }

    public void imprimeItensOpcionais() {
        System.out.println("Itens opcionais"
                +"\nAr Condicionado: " + this.arCondicionado +
                "\nDireção Hidraulica: " + this.direcaoHidraulica +
                "\nTeto solar: " + this.tetoSolar +
                "\nCambio Automatico: " + this.cambioAutomatico);
    }
}
