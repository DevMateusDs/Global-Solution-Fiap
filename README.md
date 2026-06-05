# Controle de Missão Espacial - API (Backend) 🚀

Este repositório contém a API RESTful da Solução Integrada para Controle de Missão Espacial, desenvolvida como avaliação (Global Solution) para a disciplina de Advanced Programming And Mobile Dev.

## 📋 Descrição do Projeto
O backend foi construído em **Java com Spring Boot** para atuar como o núcleo de processamento e persistência de dados da missão espacial. A API fornece os endpoints necessários para que o aplicativo mobile (front-end) possa cadastrar, consultar, atualizar e deletar informações vitais do sistema.

A aplicação utiliza persistência em disco através do banco de dados **H2 em modo file**, garantindo que os registros sejam salvos localmente e não se percam ao reiniciar a aplicação.

## 🛠️ Tecnologias e Dependências Utilizadas
* **Java** * **Spring Boot** (Web, Data JPA)
* **H2 Database Engine** (Persistência em arquivo)
* **Maven** (Gerenciamento de dependências)

## 🗂️ Estrutura de Endpoints (API REST)
A API responde na porta padrão `8080` (`http://localhost:8080`) e possui as seguintes rotas configuradas com `@CrossOrigin("*")` para integração livre com o front-end web/mobile:

### 📡 Sensores Espaciais (`/sensores`)
* `GET /sensores` - Lista todos os sensores cadastrados.
* `GET /sensores/{id}` - Busca um sensor específico.
* `POST /sensores` - Cadastra um novo sensor (nome, tipo, status, temperatura, localização).
* `PUT /sensores/{id}` - Atualiza dados de um sensor.
* `DELETE /sensores/{id}` - Remove um sensor.

### ⚠️ Alertas Críticos (`/alertas`)
* `GET /alertas` - Lista o histórico de alertas.
* `GET /alertas/{id}` - Busca um alerta específico.
* `POST /alertas` - Emite um novo alerta (título, nível, descrição, dataHora).
* `PUT /alertas/{id}` - Atualiza um alerta existente.
* `DELETE /alertas/{id}` - Exclui um alerta do registro.

### ⚙️ Eventos Operacionais (`/eventos`)
* `GET /eventos` - Consulta registros de eventos dos sistemas.
* `GET /eventos/{id}` - Busca um evento específico.
* `POST /eventos` - Registra um novo evento (sistema, descrição, status, dataHora).
* `PUT /eventos/{id}` - Atualiza o status de um evento.
* `DELETE /eventos/{id}` - Remove um evento do log.

## 🚀 Como Executar o Projeto
1. Clone este repositório e abra a pasta do projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code, etc.).
2. Aguarde a IDE baixar as dependências do Maven.
3. Navegue até a classe principal em: `src/main/java/br/com/fiap/missaoespacial/MissaoEspacialApplication.java`.
4. Execute a classe (clique no botão de **Run** ou `Shift + F10` no IntelliJ).
5. O banco de dados H2 será criado automaticamente na pasta `/data` e a API estará pronta para receber requisições. O console do H2 pode ser acessado em `http://localhost:8080/h2-console`.

---

## 👥 Integrantes da Equipe
* **Mateus de Souza Santos** - RM: 559118
* **Arthur Bergamaço Alves** - RM: 556207
* **Leonardo Medeiros da Silva** - RM: 559220

---