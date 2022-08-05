package services;

import taxa_servicos.TaxaServico;

/**
 *
 * @author Evandro
 */

public class TaxaServicoBrasileira implements TaxaServico {

    @Override
    public double taxaServicos(double valor) {
     
        if(valor <= 100.0){
            return valor * 0.2;
        }else{
            return valor * 0.15;
        }
    }
   
}
