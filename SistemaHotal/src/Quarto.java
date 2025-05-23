public class Quarto {

    private int numero;
    private String tipo;
    private float valorDiaria;
    private int capacidadeMaxima;
    private boolean disponivel;
    private boolean limpo;
    private String[] comodidades;
    private int quantidadeComodidades;

    public Quarto(int numero, String tipo, float valorDiaria, int capacidadeMaxima) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    //############################

    public boolean adicionarComodidade(String comodidade){

    }

    public boolean removerComodidade(String comodidade){

    }

    public boolean ProntoParaUso(){

    }

    //############################

    public String exibirDetalhes() {
        return "===== Quarto =====" +
                "numero = " + numero +
                "\n, tipo = " + tipo +
                "\n, valorDiaria = " + valorDiaria +
                "\n, capacidadeMaxima = " + capacidadeMaxima +
                "\n, disponivel = " + disponivel +
                "\n, limpo = " + limpo +
                "\n, quantidadeComodidades = " + quantidadeComodidades;
    }

    //############################

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}
