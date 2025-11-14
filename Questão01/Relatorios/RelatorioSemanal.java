package Relatorios;

import interfaces.IRelatorio;


public class RelatorioSemanal implements IRelatorio {
    
    private String fonte;
    private String metricas;
    private double tamanhoFonte;
    private String formatos;

    public RelatorioSemanal(String fonte, String metricas, double tamanhoFonte, String formatos) {
        this.fonte = fonte;
        this.metricas = metricas;
        this.tamanhoFonte = tamanhoFonte;
        this.formatos = formatos;
    }
    
    @Override
    public void gerarRelatorio() {
        System.out.println("Gerando Relatório Semanal com as seguintes configurações:");
        System.out.println("Fonte: " + fonte);
        System.out.println("Métricas: " + metricas);
        System.out.println("Tamanho da Fonte: " + tamanhoFonte);
        System.out.println("Formato: " + formatos);
        System.out.println("Relatório Semanal Gerado.");
    }
    
}
