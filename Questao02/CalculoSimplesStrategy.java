public class CalculoSimplesStrategy implements IPerfilStrategy {
    @Override
    public String calculoPerfil(int risco, int horizonte, int objetivo) {
        double score = (risco * 2.0) + (horizonte * 1.0) + (objetivo * 0.5);
        
        if (score <= 15) return "Conservador";
        if (score <= 25) return "Moderado";
        return "Agressivo";
    }
    
}
