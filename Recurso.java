public class Recurso {
    private int id;
    private String nomeDoRecurso;
    private String categoria;
    private boolean disponivel;
    private double valorEstimado;

    public Recurso(int id, String nomeDoRecurso, String categoria, boolean disponivel, double valorEstimado) {
        this.id = id;
        this.nomeDoRecurso = nomeDoRecurso;
        this.categoria = categoria;
        this.disponivel = disponivel;
        this.valorEstimado = valorEstimado;
    }

    public void alocar() {
        if (this.valorEstimado > (double)5000.0F) {
            System.out.println("Recurso de alto valor! Necessária autorização especial.");
        } else if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Recurso alocado com sucesso.");
        } else {
            System.out.println("Recurso indisponível.");
        }

    }

    public boolean podeSerAlocado() {
        return this.disponivel && this.valorEstimado <= (double)5000.0F;
    }

    public int getId() {
        return this.id;
    }

    public String getNomeDoRecurso() {
        return this.nomeDoRecurso;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

public String toString() {
    return "{
        "id =" + id" +
        ", Nome do Recurso =" + nomeDoRecurso +
        ", Categoria =" + categoria +
        ", Valor Estimado =" + valorEstimado
        "
}
