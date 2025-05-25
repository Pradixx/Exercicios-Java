import java.util.Date;

public class Hotel {
    private String nome;
    private String endereco;
    private int estrelas;
    private Quarto[] quartos;
    private int quantidadeQuartos;
    private Hospede[] hospedes;
    private int quantidadeHospedes;
    private Reserva[] reservas;
    private int quantidadeReservas;
    private int proximoCodigoReserva;

//############################

    public boolean adicionarQuarto(Quarto quarto) {

        return false;
    }

    public Quarto buscarQuarto(int numero){

        return null;
    }

    public boolean adicionarHospede(Hospede hospede){

    }

    public Hospede buscarHospede(String cpf){

    }

    public Reserva criarReserva(int numeroQuarto, String cpfHospede, Date dataEntrada, Date dataSaida, int quantidadePessoas){

    }

    public Reserva buscarReserva(int codigo){

    }

    public boolean cacelarReserva (int codigo){

    }

    public boolean realizarCheckin (int codigo){

    }

    public boolean realizarCheckOut (int codigo){

    }

    public void listaQuartos(){

    }

    public void listarHospede(){

    }

    public void listarReservas(){

    }

    public String exibirInformacoes(){

    }

    //############################

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

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }
}
