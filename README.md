```markdown
# 🚀 Guia: Iniciando um Projeto Spring Boot no VS Code

Este guia detalha o processo de configuração de um ambiente de desenvolvimento Back-end utilizando Java e Spring Boot no Visual Studio Code.

---

## 🛠️ 1. Preparação do Ambiente

Antes de criar o projeto, certifique-se de que o seu **Visual Studio Code** possui as ferramentas necessárias:

* **Java Extension Pack**: Instale para suporte completo à linguagem Java.
* **Spring Boot Extension Pack**: Essencial para ferramentas de inicialização e execução do Spring.

## 💻 2. Criando o Projeto (Passo a Passo)

Siga estas etapas dentro do VS Code para gerar a estrutura base do projeto:

1.  **Abrir o Initializr**: Pressione `Ctrl + Shift + P` e digite `Spring Initializr: Create a Maven Project`.
2.  **Selecionar o Gerenciador**: Escolha **Maven Project** (recomendado para APIs).
3.  **Versão do Spring Boot**: Escolha a versão estável mais recente (evite as etiquetas `SNAPSHOT` ou `M4`).
4.  **Linguagem**: Selecione **Java**.
5.  **Configurações de Identidade**:
    * **Group ID**: Domínio da organização (ex: `com.projeto`).
    * **Artifact ID**: Nome do projeto (ex: `meu-app`).
6.  **Empacotamento**: Selecione **Jar**.
7.  **Versão do Java**: Selecione a versão instalada (ex: **17** ou **21**).

## 📦 3. Dependências Iniciais

Para um projeto pronto para desenvolvimento, adicione estas dependências na criação:

* **Spring Web**: Para criar endpoints REST e rodar o servidor Tomcat.
* **Spring Boot DevTools**: Para reiniciar o servidor automaticamente.
* **Spring Data JPA**: Para persistência em bancos de dados.
* **MySQL Driver** ou **H2 Database**: Driver de conexão com o banco.

## 📂 4. Estrutura do Projeto

Após a geração, o projeto terá esta organização básica:

* `src/main/java`: Onde fica o código-fonte e suas classes (como as `models`).
* `src/main/resources`: Onde fica o arquivo `application.properties` para configurações.
* `pom.xml`: Arquivo do Maven que gerencia todas as bibliotecas.

## 🚀 5. Executando o Projeto

1.  Abra a classe principal (ex: `DemoApplication.java`).
2.  Clique no link **Run** acima do método `main`.
3.  Verifique no console o log: `Tomcat started on port 8080`.

## 📤 6. Versionamento (Git)

Utilize os comandos básicos no terminal para salvar seu progresso:

```bash
git init            # Inicializa o repositório local
git add .           # Prepara os arquivos para o commit
git commit -m "msg" # Salva as alterações
git push            # Envia para o repositório remoto
