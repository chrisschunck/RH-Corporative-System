public class Colaborador {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;
    private String dataDeAdmissao;

    public Colaborador(int id, String nome, String cargo, double salario, String dataDeAdmissao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
        this.ativo = true;
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}

public String toString() {
    return "{" + 
        "id =" + id +
        ", Nome ='" + nome + '\'' +
        ", Cargo ='" + cargo + '\'' +
        ", Salario ='" + salario + '\'' + 
        ", Data de admissão =" + dataDeAdmissao +
    "}";
    
}
