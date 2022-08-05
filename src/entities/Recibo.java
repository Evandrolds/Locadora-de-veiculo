package entities;

/**
 *
 * @author Evandro
 */
public class Recibo {
    private Double mimPagamento;
    private Double taxa;

    public Recibo() {
    }

    public Recibo(Double mimPagamento, Double taxa) {
        this.mimPagamento = mimPagamento;
        this.taxa = taxa;
    }

    public Double getMimPagamento() {
        return mimPagamento;
    }

    public void setMimPagamento(Double mimPagamento) {
        this.mimPagamento = mimPagamento;
    }
    
    
    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    
    public Double pagamentoTotal(){
         return getMimPagamento()+ getTaxa();
    }

    @Override
    public String toString() {
        return " ---------- Recibo ---------- " +
                "Pagamento minimo R$ " + mimPagamento + 
                ", taxa: R$ " + taxa + '}';
    }

    
}
