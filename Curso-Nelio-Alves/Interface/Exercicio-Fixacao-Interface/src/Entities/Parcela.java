package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataParcela;
    private double montante;

    public Parcela(LocalDate dataParcela, double montante) {
        this.dataParcela = dataParcela;
        this.montante = montante;
    }

    public LocalDate getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(LocalDate dataParcela) {
        this.dataParcela = dataParcela;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return dataParcela.format(fmt) + " - " + String.format("%.2f", montante);
    }
}
