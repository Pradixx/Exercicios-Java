import java.util.Date;

public class Reserva {
    private int codigo;
    private Quarto quarto;
    private Hospede hospede;
    private Date dataEntrada;
    private Date dataSaida;
    private int quantidadePessoas;
    private boolean checkInRealizado;
    private boolean CheckOutRealizado;
    private float valorTotal;

    public Reserva(int codigo, Quarto quarto, Hospede hospede, Date dataEntrada, Date dataSaida, int quantidadePessoas) {
        this.codigo = codigo;
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quantidadePessoas = quantidadePessoas;
    }

    //############################


    public String exibirDetalhes() {
        return "===== Reserva =====" +
                "\ncodigo = " + codigo +
                "\n, quarto = " + quarto +
                "\n, hospede = " + hospede +
                "\n, dataEntrada = " + dataEntrada +
                "\n, dataSaida = " + dataSaida +
                "\n, quantidadePessoas = " + quantidadePessoas +
                "\n, checkInRealizado = " + checkInRealizado +
                "\n, CheckOutRealizado = " + CheckOutRealizado +
                "\n, valorTotal = " + valorTotal;
    }


    //############################

    private void calcularValorTotal(){

    }

    public boolean realizarCheckIn(){

    }

    public boolean realizarCheckOut(){

    }

    public boolean cancelarReserva(){

    }

    //############################

    public int getCodigo() {
        return codigo;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public boolean isCheckInRealizado() {
        return checkInRealizado;
    }

    public boolean isCheckOutRealizado() {
        return CheckOutRealizado;
    }

    public float getValorTotal() {
        return valorTotal;
    }


}
