package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private int numero;
    private LocalDate date;
    private double valorTotal;
    private List<Parcela> parcela = new ArrayList<>();

    public Contrato(int numero, LocalDate date, double valorTotal) {
        this.numero = numero;
        this.date = date;
        this.valorTotal = valorTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcela() {
        return parcela;
    }
}
