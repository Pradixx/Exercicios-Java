package Entities;

import java.util.Date;

public class ProdutoImportado extends Produto{

    private double custosFee;

    public ProdutoImportado(String nome, double preco, double custosFee) {
        super(nome, preco);
        this.custosFee = custosFee;
    }

    public double getCustosFee() {
        return custosFee;
    }

    public void setCustosFee(double custosFee) {
        this.custosFee = custosFee;
    }

    @Override
    public String priceTag() {
        return getNome() + " R$ " + getPreco() + " (Custos Fee: " + custosFee + ")";
    }
}
