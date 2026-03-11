import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======Cadastro do colaborador=======");
        System.out.print("Digite o id do colaborador: ");
        int idColaborador = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do colaborador: ");
        String nomeColaborador = scanner.nextLine();

        System.out.print("Digite o cargo do colaborador: ");
        String cargoColaborador = scanner.nextLine();

        System.out.print("Digite o salário do colaborador: ");
        double salarioColaborador = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a data de admissão do colaborador: ");
        String dataDeAdmissaoColaborador = scanner.nextLine();

        Colaborador c = new Colaborador(idColaborador, nomeColaborador, cargoColaborador, salarioColaborador, dataDeAdmissaoColaborador);

        System.out.println("=======Cadastro do Recurso=======");
        System.out.print("\nDigite o id do recurso: ");
        int idRecurso = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do recurso: ");
        String nomeRecurso = scanner.nextLine();

        System.out.print("Digite a categoria do recurso: ");
        String categoriaRecurso = scanner.nextLine();

        System.out.print("O recurso está disponível? (true/false): ");
        boolean disponivelRecurso = scanner.nextBoolean();

        System.out.print("Digite o valor estimado do recurso: ");
        double valorEstimadoRecurso = scanner.nextDouble();
        scanner.nextLine();

        Recurso r = new Recurso(idRecurso, nomeRecurso, categoriaRecurso, disponivelRecurso, valorEstimadoRecurso);

        System.out.println("=======Cadastro de Alocação=======");
        System.out.print("\nDigite a data da alocação: ");
        String dataAlocacao = scanner.nextLine();

        System.out.print("Digite uma observação (opcional): ");
        String observacao = scanner.nextLine();

        Alocacao a = Alocacao.criarAlocacao(c, r, dataAlocacao, observacao);

        if (a != null) {
            System.out.println("\n✅ Alocação criada com sucesso!");
            System.out.println("Colaborador ID: " + a.getColaboradorId());
            System.out.println("Recurso ID: " + a.getRecursoId());
            System.out.println("Data: " + a.getData());
            System.out.println("Observação: " + a.getObservacao());
        }

        scanner.close();
        System.out.print("informações cadastradas com sucesso!");
    }
}
