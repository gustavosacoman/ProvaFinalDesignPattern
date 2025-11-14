import Factories.RelatorioDiarioFactory;
import Factories.RelatorioEmergencialFactory;
import Factories.RelatorioFactory;
import Factories.RelatorioSemanalFactory;
import interfaces.IRelatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Início dos Testes do Sistema de Relatórios ---");

        System.out.println("\n[Cenário 1: Solicitação de Relatório Diário]");
        
        String fonteDiaria = "db_operacional_01";
        String metricasDiarias = "vendas_dia, logística_ativa";
        double tamanhoFontePadrao = 10.5;
        String formatoPDF = "PDF";

        RelatorioFactory fabricaDiaria = new RelatorioDiarioFactory(
            fonteDiaria, 
            metricasDiarias, 
            tamanhoFontePadrao, 
            formatoPDF
        );

        IRelatorio relatorio1 = fabricaDiaria.criarTipoRelatorio();

        relatorio1.gerarRelatorio();

        System.out.println("\n[Cenário 2: Solicitação de Relatório Emergencial]");

        String fonteEmergencial = "logs_servidor_erro_#199";
        String metricasEmergenciais = "stack_trace, impacto_usuarios";
        double tamanhoFonteUrgente = 14.0;
        String formatoTexto = "TXT";

        RelatorioFactory fabricaEmergencial = new RelatorioEmergencialFactory(
            fonteEmergencial, 
            metricasEmergenciais, 
            tamanhoFonteUrgente, 
            formatoTexto
        );

        IRelatorio relatorio2 = fabricaEmergencial.criarTipoRelatorio();

        relatorio2.gerarRelatorio();
        
        RelatorioFactory fabricaSemanal = new RelatorioSemanalFactory(
            "data_warehouse_04", 
            "vendas_consolidadas_semana, performance_regional", 
            11.0, 
            "HTML"
        );
        
        IRelatorio relatorio3 = fabricaSemanal.criarTipoRelatorio();
        relatorio3.gerarRelatorio();

    }
}