package Factories;

import Relatorios.RelatorioDiario;
import interfaces.IRelatorio;

public class RelatorioDiarioFactory extends RelatorioFactory {

    public RelatorioDiarioFactory(String Fonte, String Metricas,
     double TamanhoFonte, String Formato) 
     {
        super(Fonte, Metricas, TamanhoFonte, Formato);
    }
    @Override
    public IRelatorio criarTipoRelatorio() {
        return new RelatorioDiario(this.Fonte, this.Metricas, this.TamanhoFonte, this.Formato);
    }
    
}
