public class CalculoPrecisoStrategy implements IPerfilStrategy {
    @Override
    public String calculoPerfil(int risco, int horizonte, int objetivo) {
        if (risco < 3) {
            return "Conservador (Forçado pelo Risco)";
        }
        
        int media = (risco + horizonte + objetivo) / 3;
        
        if (media > 7) return "Agressivo";
        return "Moderado";
    }
}

