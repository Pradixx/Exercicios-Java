public class Celular {
    public String marca;
    public String modelo;
    public String cor;
    private int carga;
    private boolean ligando;

    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está ligando? " + this.ligando);
    }
    public void ligar(){
        this.ligando = true;
    }
    public void desligar(){
        this.ligando = false;
    }
    public void tirarFoto(){
        if (this.carga >= 50 && this.ligando == true){
            System.out.println("Diga X *Foto tirada*");
        } else {
            System.out.println("Erro! Carga abaixo do permitido");
        }
    }
    public void encherCarga(){
        if (this.ligando == true){
            this.carga = 100;
            System.out.println("Carga suficiente");
        } else {
            this.carga = 0;
            System.out.println("Erro! Carga não suficiente");
        }
    }
}
