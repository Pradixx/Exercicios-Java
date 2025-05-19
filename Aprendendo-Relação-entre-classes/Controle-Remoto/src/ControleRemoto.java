public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.ligando = false;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean isLigando() {
        return ligando;
    }

    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }



    public void ligar(){
        this.setLigando(true);
    }

    public void desligar(){
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        int i;
        System.out.println("Está ligando? " + this.isLigando());
        System.out.println("Está tocando? " + this.isTocando());

        for (i=0; i <= this.getVolume(); i+=10){
            System.out.print("[]");
        }
        System.out.println(" ");
    }

    public void fecharMenu(){
        System.out.println("Fechando menu");
    }

    public void maisVolume(){
        if (this.isTocando()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    public void menosVolume(){
        if (this.isLigando()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    public void ligarMudo(){
        if (this.isLigando() && this.getVolume() >= 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if (this.isLigando() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if  (this.isLigando() && ! this.isTocando()){
            this.setTocando(true);
        }
    }

    public void pause(){
        if (this.isLigando() && this.isTocando()){
            this.setTocando(false);
        }
    }
}
