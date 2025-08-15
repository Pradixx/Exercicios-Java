package Services;

public class ServicoPaypal implements ServicoOnlinePagamento{

    private static final double porcentagemFee = 0.02;
    private static final double interesseMonthly = 0.01;

    @Override
    public double pagamentoFee(double montante) {
        return montante * porcentagemFee;
    }

    @Override
    public double interesse(double montante, int mes) {
        return montante * interesseMonthly * mes;
    }
}
