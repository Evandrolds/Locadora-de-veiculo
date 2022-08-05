package entities;

import java.util.Date;

/**
 *
 * @author Evandro
 */
public class AluguelCarro {
    private Date entrada;
    private Date saida;
    private Veiculo veiculo;
    private Recibo fatura;

    public AluguelCarro(Date entrada, Date saida, Veiculo veiculo) {
        this.entrada = entrada;
        this.saida = saida;
        this.veiculo = veiculo;
        
    }

    @Override
    public String toString() {
        return " --------------- Aluguel de Carros ------------ \n"
                + "  veiculo: " + veiculo
                + "\n Hora de entradda: " + entrada 
                + "\n Hora de saida:" + saida 
                +  "\n Pagamento minimo " + String.format("%.2f",fatura.getMimPagamento())+
                " \n Taxa: R$ " + String.format("%.2f", fatura.getTaxa() )+
                "\n Total a pagar R$ " + String.format("%.2f", fatura.pagamentoTotal());
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Recibo getfatura() {
        return fatura;
    }

    public void setfatura(Recibo fatura) {
        this.fatura = fatura;
    }

   
}
