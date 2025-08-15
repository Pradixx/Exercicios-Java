package Services;

import Entities.Contrato;
import Entities.Parcela;

import java.time.LocalDate;

public class ServicoContrato {

    private ServicoOnlinePagamento onlinePagamento;

    public ServicoContrato(ServicoOnlinePagamento onlinePagamento){
        this.onlinePagamento = onlinePagamento;
    }

    public void processoContrato(Contrato contrato, int mes){
        double quotaBasica = contrato.getValorTotal() / mes;


        LocalDate dataParcela = contrato.getDate();
        for (int i = 1; i <= mes; i++) {
            dataParcela = dataParcela.plusMonths(1);
            double interesse = onlinePagamento.interesse(quotaBasica, i);
            double fee = onlinePagamento.pagamentoFee(quotaBasica + interesse);

            double quota = quotaBasica + interesse + fee;
            contrato.getParcela().add(new Parcela(dataParcela, quota));
        }
    }
}
