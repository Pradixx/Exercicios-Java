public class Banco {

    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Numero da Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            setSaldo(50);
        } else if (tipo == "CP") {
            setSaldo(150);
        }
        System.out.println("Conta aberta");
    }

    public void fecharConta(){

        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void depositar(float valor){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito efetuado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível efetuar o depósito");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque efetuado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível efetuar o saque");
        }
    }

    public void pagarMensal(){
        int valor = 0;
        if (this.getTipo() == "CC"){
            valor = 12;
        } else if (this.getTipo() == "CP"){
            valor = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar mensalidade");
        }

    }



    //abrir conta pessoa esoolhe se vai ser cp ou cc.
    // cc 50. cp 150.
//fehcar conta tem que ta vazio
//saque não pode mais doque tem
//mesnsal cc 15. cp 20
//contrutor conta fechada e saldo 0
}
