public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    private int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Erro! Não pode rabiscar");
        } else {
            System.out.print("Rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }

    public void encherCarga(){
        this.carga = 100;
    }

    public void esvaziarCaneta(){
        this.carga = 0;
    }

    public void destampar(){
        this.tampada = false;
    }
}
