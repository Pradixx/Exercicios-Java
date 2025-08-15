package Services;

public interface ServicoOnlinePagamento {

    double pagamentoFee(double montante);
    double interesse(double montante, int mes);
}
