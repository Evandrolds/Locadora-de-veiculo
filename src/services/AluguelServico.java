package services;

import entities.AluguelCarro;
import entities.Recibo;

/**
 *
 * @author Evandro
 */
public class AluguelServico {
    private Double precoPorHora;
    private Double precoPorDia;
    private TaxaServicoBrasileira taxaBrasileira;
    private Recibo fatura;

    public AluguelServico(Double precoPorHora, Double precoPorDia, TaxaServicoBrasileira taxaBrasileira) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaBrasileira = taxaBrasileira;
    }

   
    public Recibo getFatura() {
        return fatura;
    }

    public void setFatura(Recibo fatura) {
        this.fatura = fatura;
    }
   

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public TaxaServicoBrasileira getTaxaBrasileira() {
        return taxaBrasileira;
    }

    public void setTaxaBasileira(TaxaServicoBrasileira taxaBrasileira) {
        this.taxaBrasileira = taxaBrasileira;
    }
    
    public void processInvoice(AluguelCarro carRental) {
		long t1 = carRental.getEntrada().getTime();
		long t2 = carRental.getSaida().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}

		double tax = taxaBrasileira.taxaServicos(pagamentoBasico);

		carRental.setfatura(new Recibo(pagamentoBasico, tax));
	}

    @Override
    public String toString() {
        return " ---------------- AluguelServico ---------------\n " +
                " Preco por hora: R$ " +String.format("%.2f",getPrecoPorHora()) +
                "\n Preco por dia: R$ " +String.format("%.2f", getPrecoPorDia()) +
                "\n ";
    }
    
}
