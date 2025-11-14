package Factories;

import Relatorios.RelatorioSemanal;
import interfaces.IRelatorio;

public class RelatorioSemanalFactory extends RelatorioFactory {

    public RelatorioSemanalFactory(String Fonte, String Metricas,
     double TamanhoFonte, String Formato) 
     {
        super(Fonte, Metricas, TamanhoFonte, Formato);
    }

    @Override
    public IRelatorio criarTipoRelatorio() {
        return new RelatorioSemanal(this.Fonte, this.Metricas, this.TamanhoFonte, this.Formato);
    }
    
}
