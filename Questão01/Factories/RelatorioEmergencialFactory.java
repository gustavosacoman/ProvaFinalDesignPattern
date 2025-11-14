package Factories;

import Relatorios.RelatorioEmergencial;
import interfaces.IRelatorio;

public class RelatorioEmergencialFactory extends RelatorioFactory {


    public RelatorioEmergencialFactory(String Font, String Metrics,
     double FontSize, String Formato) 
     {
        super(Font, Metrics, FontSize, Formato);
    }
    @Override
    public IRelatorio criarTipoRelatorio() {
        return new RelatorioEmergencial(this.Fonte, this.Metricas, this.TamanhoFonte, this.Formato);
    }
    
}
