package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

    private Date data;

    public ProdutoUsado(String nome, double preco, Date data) {
        super(nome, preco);
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return getNome() + " R$ " + getPreco() + " (Feito na data: " + sdf.format(data) + ")";
    }

}
