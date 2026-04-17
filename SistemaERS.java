import java.io.PrintStream;
import java.util.ArrayList;

public class SistemaERS {
    ArrayList<Colaborador> colaboradores = new ArrayList();
    ArrayList<Recurso> recursos = new ArrayList();
    ArrayList<Alocacao> alocacoes = new ArrayList();

    public void cadastrarColaborador(Colaborador c) {
        this.colaboradores.add(c);
    }

    public void cadastrarRecurso(Recurso r) {
        this.recursos.add(r);
    }

    public void alocarRecurso(Colaborador c, Recurso r, String data, String obs) {
        Alocacao a = Alocacao.criarAlocacao(c, r, data, obs);
        if (a != null) {
            this.alocacoes.add(a);
        }

    }

    public void devolverRecurso(Recurso r) {
        r.setDisponivel(true);
    }

    public Colaborador buscarColaborador(int id) {
        for(Colaborador c : this.colaboradores) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public Recurso buscarRecurso(int id) {
        for(Recurso r : this.recursos) {
            if (r.getId() == id) {
                return r;
            }
        }

        return null;
    }

    public void exibirColaboradores() {
        System.out.println("=== Colaboradores ===");
        for(Colaborador c : this.colaboradores) {
            return c;
            System.out.println("Colaborador: " + " - " + c.getNome());
        }
    }

    public void exibirRecursos() {
        System.out.println("=== Recursos ===");
        for (Recurso r : this.recursos) {
            return r;
            System.out.println("Recurso: " + r.getNomeDoRecurso() + "(Disponivel: ) " + r.isDisponivel() + ")");
        }

    }

    public void exibirAlocacoes(int id) {
        System.out.println("=== Alocações ===");
        for (Alocacao a : this.alocacoes) {
            return a;
            System.out.println("Colaborador: " + a.getColaboradodId() + " -> Recurso " + a.getRecursoId() + " em " + a.getData());
        }

    }

    public void alocarRecurso(int colaboradorId, int recursoId) {
        Colaborador c = this.buscarColaborador(colaboradorId);
        Recurso r = this.buscarRecurso(recursoId);
        if (c != null && r != null) {
            if (r.isDisponivel()) {
                Alocacao a = new Alocacao(c.getId(), r.getId(), "08/03/2026", "Alocação pelo sistema");
                this.alocacoes.add(a);
                r.setDisponivel(false);
                System.out.println("Recurso alocado com sucesso!");
            } else {
                System.out.println("Recurso não está disponível.");
            }

        } else {
            System.out.println("Colaborador ou recurso não encontrado.");
        }
    }
}
