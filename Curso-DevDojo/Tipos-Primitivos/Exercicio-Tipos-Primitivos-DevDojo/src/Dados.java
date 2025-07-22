import java.util.Date;

public class Dados {

    private String nome;
    private String endereco;
    private int salario;
    private Date data;

    public Dados(String nome, String endereco, int salario, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
