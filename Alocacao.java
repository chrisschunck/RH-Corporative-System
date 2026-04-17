public class Alocacao {
    private int colaboradorId;
    private int recursoId;
    private String data;
    private String observacao;

    public Alocacao(int colaboradorId, int recursoId, String data, String observacao) {
        this.colaboradorId = colaboradorId;
        this.recursoId = recursoId;
        this.data = data;
        this.observacao = observacao;
    }

    public static Alocacao criarAlocacao(Colaborador colaborador, Recurso recurso, String data, String observacao) {
        if (recurso.isDisponivel()) {
            recurso.setDisponivel(false);
            return new Alocacao(colaborador.getId(), recurso.getId(), data, observacao);
        }
        return null;
    }

    public int getColaboradorId() {
        return colaboradorId;
    }
    public int getRecursoId() {
        return recursoId;
    }
    public String getData() {
        return data;
    }
    public String getObservacao() {
        return observacao;
    }
}

@Override
public String toString() {
    return "{" +
        "ID colaborador ='" + colaboradorId + '\'' +
        ", ID recurso ='" + recursoId + '\'' +
        ", Data ='" + data + '\'' + 
        ", Obs ='" + observacao + '\'' +
    "}";
    
}
