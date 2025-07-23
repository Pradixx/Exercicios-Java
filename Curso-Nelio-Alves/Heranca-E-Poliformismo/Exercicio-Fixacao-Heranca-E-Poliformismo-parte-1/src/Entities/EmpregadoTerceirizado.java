package Entities;

public class EmpregadoTerceirizado extends Empregado{

    private int porcentagem;

    public EmpregadoTerceirizado(String nome, int horas, double valorPorHora, int porcentagem) {
        super(nome, horas, valorPorHora);
        this.porcentagem = porcentagem;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + porcentagem * 1.1;
    }
}

