public class Celular {
    public String marca;
    public String modelo;
    public String cor;
    private int carga;
    private boolean ligando;

    public Celular(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.carga = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isLigando() {
        return ligando;
    }

    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public void  status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está ligando? " + this.ligando);
    }
    public void ligar(){
        setLigando(true);
    }
    public void desligar(){
        setLigando(false);
    }
    public void tirarFoto(){
        if (this.getCarga() >= 50 && this.isLigando() == true){
            System.out.println("Diga X *Foto tirada*");
        } else {
            System.out.println("Erro! Carga abaixo do permitido");
        }
    }
    public void encherCarga(){

        if (this.isLigando() == true){
            this.setCarga(this.getCarga() + 100);
            System.out.println("Carga suficiente");
        } else {
            this.setCarga(0);
            System.out.println("Erro! Carga não suficiente");
        }
    }
}
