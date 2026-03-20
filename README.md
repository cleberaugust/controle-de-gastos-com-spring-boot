Controle de Gastos (Gestão de Custos)
📖 Sobre o Projeto
O Controle de Gastos é uma API REST desenvolvida em Java com Spring Boot para gerenciar despesas financeiras. O diferencial deste projeto é o foco em estudos de performance, demonstrando a eficiência do uso de Paginação (Spring Data Pageable) e Cache (Spring Cache) em cenários com grandes volumes de dados (ex: massa de teste com 150.000 registros).

🚀 Tecnologias e Recursos
Java 21

Spring Boot 3

Spring Data JPA: Persistência de dados com suporte a UUID.

Hibernate: Mapeamento objeto-relacional (ORM).

Banco de Dados: Configurado para uso com tabelas de despesas.

Spring Cache: Otimização de consultas repetitivas.

Performance Testing: Utilização de StopWatch e currentTimeMillis para medir latência de respostas.

🛠️ Funcionalidades e Endpoints
A aplicação expõe uma interface de performance em /gestao/performance:

Listagem Sem Paginação: GET /sem-paginacao - Demonstra o alto consumo de memória e tempo ao carregar todos os registros.

Listagem Com Paginação: GET /com-paginacao - Retorna dados de forma segmentada (Pages), reduzindo o tempo de resposta.

Busca por E-mail com Paginação: GET /com-paginacao/{email} - Filtro otimizado.

Busca com Cache: GET /cache/{email} - Utiliza @Cacheable para entregar resultados instantâneos após a primeira consulta.

📊 Diferenciais Técnicos
Geração de Seed (Massa de Dados): Inclui um componente GestaoDeDespesaSeeder capaz de popular o banco com 150.000 despesas para testes de estresse.

Métricas de Tempo: O sistema imprime no console o tempo de execução de cada busca, permitindo a comparação real entre os métodos.

Identificadores Únicos: Uso de UUID para as chaves primárias, garantindo maior segurança e escalabilidade.

⚙️ Como executar
Clone o repositório.

Configure o banco de dados no application.properties.

Execute a aplicação via IntelliJ ou Maven:

mvn spring-boot:run

Verifique os logs no console para acompanhar os tempos de processamento.