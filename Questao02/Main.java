public class Main {
    public static void main(String[] args) {

        int riscoCliente1 = 7;
        int horizonteCliente1 = 8;
        int objetivoCliente1 = 6;
        
        System.out.println("\n[Cliente 1] Risco: 7, Horizonte: 8, Objetivo: 6");

        
        IPerfilStrategy modeloPadrao = new CalculoSimplesStrategy();
        IPerfilStrategy modeloPonderado = new CalculoPonderadoStrategy();
        IPerfilStrategy modeloVeto = new CalculoPrecisoStrategy();

        AnaliseInvestimentos analisador = new AnaliseInvestimentos(modeloPadrao);

        String perfil1 = analisador.executeStrategy(riscoCliente1, horizonteCliente1, objetivoCliente1);
        System.out.println("Resultado (Modelo Simples): " + perfil1);

        System.out.println("...Trocando para o Modelo Ponderado...");
        analisador.setStrategy(modeloPonderado);

        String perfil2 = analisador.executeStrategy(riscoCliente1, horizonteCliente1, objetivoCliente1);
        System.out.println("Resultado (Modelo Ponderado): " + perfil2);

        int riscoCliente2 = 2;
        int horizonteCliente2 = 10;
        int objetivoCliente2 = 10;
        
        System.out.println("\n[Cliente 2] Risco: 2, Horizonte: 10, Objetivo: 10");

        System.out.println("...Trocando para o Modelo de Veto...");
        analisador.setStrategy(modeloVeto);
        
        String perfil3 = analisador.executeStrategy(riscoCliente2, horizonteCliente2, objetivoCliente2);
        System.out.println("Resultado (Modelo Veto): " + perfil3);
        
    }
}
