package entities;

public class Empregados {

    private String nome;
    private Integer id;
    private Double salario;

    public Empregados(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String visual() {
        return "Empregados = " +
                "nome = " + nome +
                ", id = " + id +
                ", salario = " + salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentandoSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }
}
