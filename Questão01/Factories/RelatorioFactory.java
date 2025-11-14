package Factories;

import interfaces.IRelatorio;

public abstract class RelatorioFactory {

    protected String Fonte;
    protected String Metricas;
    protected double TamanhoFonte;
    protected String Formato;

    protected RelatorioFactory(String fonte, String metricas, double tamanhoFonte, String formato) {
        this.Fonte = fonte;
        this.Metricas = metricas;
        this.TamanhoFonte = tamanhoFonte;
        this.Formato = formato;
    }

    public abstract IRelatorio criarTipoRelatorio();

} 
