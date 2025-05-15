public class Celular {
    String marca;
    String modelo;
    String cor;
    int carga;
    boolean ligando;

    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está ligando? " + this.ligando);
    }
    void ligar(){
        this.ligando = true;
    }
    void desligar(){
        this.ligando = false;
    }
    void tirarFoto(){
        if (this.carga >= 50 && this.ligando == true){
            System.out.println("Diga X *Foto tirada*");
        } else {
            System.out.println("Erro! Carga abaixo do permitido");
        }
    }
}
