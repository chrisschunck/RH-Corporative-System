🌐 Sistema Corporativo de Recursos Humanos
Projeto desenvolvido para a disciplina de Programação Orientada a Objetos em Java com o objetivo de aplicar conceitos fundamentais de classes, objetos e relacionamentos na gestão de colaboradores e recursos dentro de uma organização.

📌 Objetivo
Gerenciar colaboradores, recursos e alocações em um sistema simples de RH. A aplicação permite:
- Cadastro de colaboradores com dados básicos
- Cadastro de recursos corporativos
- Alocação de recursos a colaboradores
- Devolução de recursos
- Visualização de registros de colaboradores, recursos e alocações

⚙️ Tecnologias
- Java 17+
- IntelliJ IDEA (IDE utilizada)
- Git/GitHub para versionamento

🧠 Lógica de Negócio
A lógica do sistema é baseada nos seguintes conceitos:
- Colaborador: possui ID, nome, cargo, salário e data de admissão.
- Recurso: possui ID, nome, categoria, disponibilidade e valor estimado.
- Alocação: relaciona colaborador e recurso em uma data específica, com observação opcional.
- SistemaERS: gerencia listas de colaboradores, recursos e alocações, permitindo operações de cadastro, busca e exibição.

📂 Funcionalidades
- Inserção de colaboradores e recursos via terminal
- Alocação de recursos com validação de disponibilidade
- Devolução de recursos ao sistema
- Busca de colaboradores e recursos por ID
- Exibição de todos os registros cadastrados

🧩 Estrutura Modular
- Main: interface principal via terminal
- Colaborador: classe que representa o colaborador
- Recurso: classe que representa o recurso corporativo
- Alocacao: classe que representa a alocação de recursos
- SistemaERS: classe que gerencia as listas e operações do sistema

▶️ Execução
Compile e execute a classe Main no terminal ou pela IDE:
javac Main.java
java Main



💡 Exemplo de Uso
=======Cadastro do colaborador=======
Digite o id do colaborador: 1
Digite o nome do colaborador: Maria Silva
Digite o cargo do colaborador: Analista
Digite o salário do colaborador: 4500
Digite a data de admissão do colaborador: 01/02/2022

=======Cadastro do Recurso=======
Digite o id do recurso: 101
Digite o nome do recurso: Notebook Dell
Digite a categoria do recurso: TI
O recurso está disponível? (true/false): true
Digite o valor estimado do recurso: 3500

=======Cadastro de Alocação=======
Digite a data da alocação: 10/03/2026
Digite uma observação (opcional): Uso para home office

✅ Alocação criada com sucesso!
Colaborador ID: 1
Recurso ID: 101
Data: 10/03/2026
Observação: Uso para home office



👨‍🏫 Avaliação
Critérios atendidos:
- Estruturas de decisão e repetição
- Validação de dados de entrada
- Armazenamento com listas (ArrayList)
- Modularização com classes e métodos
- Interface clara no terminal
- Comentários explicativos

🧾 Autor
Christian Schunck

📎 Licença
Este projeto é acadêmico e livre para fins educacionais.
