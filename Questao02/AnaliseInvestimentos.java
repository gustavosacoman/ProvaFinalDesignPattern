public class AnaliseInvestimentos {
    private IPerfilStrategy perfilStrategy;

    public AnaliseInvestimentos(IPerfilStrategy perfilStrategy) {
        this.perfilStrategy = perfilStrategy;
    }

    public void setStrategy(IPerfilStrategy perfilStrategy)
    {
        this.perfilStrategy = perfilStrategy;
    }

    public String executeStrategy(int pontuacaoRisco, int pontuacaoHorizonte, int pontuacaoObjetivo) {
        return perfilStrategy.calculoPerfil(pontuacaoRisco, pontuacaoHorizonte, pontuacaoObjetivo);
    }
}