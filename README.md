# 🚀 Guia: Iniciando um Projeto Spring Boot no VS Code

Este guia detalha o processo de configuração de um ambiente de desenvolvimento Back-end utilizando Java e Spring Boot.

## 🛠️ 1. Preparação do Ambiente
Antes de criar o projeto, certifique-se de que o seu **Visual Studio Code** possui as ferramentas necessárias:
* [cite_start]**Java Extension Pack**: Instale para suporte completo à linguagem Java[cite: 11].
* [cite_start]**Spring Boot Extension Pack**: Essencial para ferramentas de inicialização e execução do Spring[cite: 11].

## 💻 2. Criando o Projeto (Passo a Passo)
[cite_start]Siga estas etapas dentro do VS Code para gerar a estrutura base do projeto[cite: 10]:

1.  [cite_start]**Abrir o Initializr**: Pressione `Ctrl + Shift + P` e digite `Spring Initializr: Create a Maven Project`[cite: 12].
2.  [cite_start]**Selecionar o Gerenciador**: Escolha **Maven Project** (recomendado para APIs)[cite: 10].
3.  [cite_start]**Versão do Spring Boot**: Escolha a versão estável mais recente (evite as etiquetas `SNAPSHOT` ou `M4`)[cite: 10].
4.  [cite_start]**Linguagem**: Selecione **Java**[cite: 10].
5.  **Configurações de Identidade**:
    * [cite_start]**Group ID**: Domínio da organização (ex: `com.projeto`)[cite: 12].
    * [cite_start]**Artifact ID**: Nome do projeto (ex: `meu-app`)[cite: 12].
6.  [cite_start]**Empacotamento**: Selecione **Jar**[cite: 12].
7.  [cite_start]**Versão do Java**: Selecione a versão instalada (ex: **17** ou **21**)[cite: 12].

## 📦 3. Dependências Iniciais
[cite_start]Para um projeto pronto para desenvolvimento, adicione estas dependências na criação[cite: 12]:
* **Spring Web**: Para criar endpoints REST e rodar o servidor Tomcat.
* **Spring Boot DevTools**: Para reiniciar o servidor automaticamente.
* **Spring Data JPA**: Para persistência em bancos de dados.
* **MySQL Driver** ou **H2 Database**: Driver de conexão com o banco.

## 📂 4. Estrutura do Projeto
Após a geração, o projeto terá esta organização básica:
* [cite_start]`src/main/java`: Onde fica o código-fonte e suas classes (como as `models`)[cite: 12].
* `src/main/resources`: Onde fica o arquivo `application.properties` para configurações.
* `pom.xml`: Arquivo do Maven que gerencia todas as bibliotecas.

## 🚀 5. Executando o Projeto
1.  Abra a classe principal (ex: `DemoApplication.java`).
2.  Clique no link **Run** acima do método `main`.
3.  Verifique no console o log: `Tomcat started on port 8080`.

## 📤 6. Versionamento (Git)
[cite_start]Utilize os comandos básicos no terminal para salvar seu progresso[cite: 17, 18]:

```bash
git init            # Inicializa o repositório local
git add .           # Prepara os arquivos para o commit
git commit -m "msg" # Salva as alterações
git push            # Envia para o repositório remoto
