public class Hospede {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private boolean vip;

    //###########################

    public Hospede(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    //###########################

    public String exibirDetalhes() {
        return "===== Hospede =====" +
                "nome = " + nome +
                "\n, cpf = " + cpf +
                "\n, telefone = '" + telefone +
                "\n, email = '" + email +
                "\n, endereco = '" + endereco +
                "\n, vip = " + vip;
    }


    //###########################

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    //###########################

}
