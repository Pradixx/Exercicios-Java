public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    //########################################################################

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    //########################################################################

    @Override
    public String toString() {
        return "====== Pessoa ======" +
                "\nNome = " + nome +
                "\n, idade = " + idade +
                "\n, sexo = " + sexo  +
                "\n, experiencia = " + experiencia;
    }


    //########################################################################

    protected void ganharExp(){
        this.experiencia++;
    }

    //########################################################################


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
