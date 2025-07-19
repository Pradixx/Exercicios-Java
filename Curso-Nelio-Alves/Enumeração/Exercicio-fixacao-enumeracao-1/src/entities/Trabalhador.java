package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entitiesEnum.LevelTrabalhador;
import entities.HorasContrato;

public class Trabalhador {
    private String name;
    private LevelTrabalhador level;
    private double salarioBase;

    private Departamento departamento;
    private List<HorasContrato> contratos = new ArrayList<>();

    public Trabalhador(String name, LevelTrabalhador level, double salarioBase, Departamento departamento) {
        this.name = name;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(LevelTrabalhador level) {
        this.level = level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<HorasContrato> contratos) {
        this.contratos = contratos;
    }

    public void addContrato(HorasContrato contrato){
        contratos.add(contrato);
    }

    public void removeContrato(HorasContrato contrato){
        contratos.remove(contrato);
    }

    public double calculo(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (HorasContrato c : contratos){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}

