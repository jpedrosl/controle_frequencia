# Spring Initializr — Guia focado: Site + Visual Studio Code

Este README é uma versão enxuta e prática para gerar e abrir um projeto Spring Boot usando o Spring Initializr (site) e o Visual Studio Code.

## Objetivo

Mostrar, passo a passo, como:
- Gerar um projeto no site `https://start.spring.io`.
- Abrir/importar o projeto no Visual Studio Code (Windows PowerShell como exemplo).

## Checklist

- Gerar projeto pelo site. [Done]
- Usar VS Code para criar/importar via extensão ou abrir pasta. [Done]
- Comandos PowerShell para baixar/extrair e executar com o Maven wrapper. [Done]

## Pré-requisitos

- Java JDK 11 ou superior instalado e `JAVA_HOME` configurado.
- Visual Studio Code instalado.
- Extensões recomendadas no VS Code:
  - "Spring Boot Extension Pack" (contém suporte Spring Initializr)
  - "Language Support for Java(TM) by Red Hat"
  - "Debugger for Java"

## 1) Gerar o projeto no site (start.spring.io)

1. Acesse: https://start.spring.io
2. Preencha as opções principais:
   - Project: Maven Project (ou Gradle)
   - Language: Java
   - Spring Boot: selecione uma versão estável compatível com seu JDK
   - Group / Artifact: configure conforme sua preferência
   - Packaging: Jar
   - Java: versão do seu JDK
3. Em "Dependencies" adicione o mínimo necessário (ex.: Spring Web).
4. Clique em "Generate" — será baixado um arquivo ZIP com o projeto.

Observação: você pode customizar as dependências e metadados antes de gerar.

## 2) Baixar e extrair usando PowerShell (opcional)

Se preferir baixar sem o navegador, use este comando PowerShell para criar um projeto básico com a dependência `web` e nome `demo`:

```powershell
Invoke-WebRequest -Uri "https://start.spring.io/starter.zip?type=maven-project&language=java&dependencies=web&name=demo" -OutFile demo.zip
Expand-Archive -Path demo.zip -DestinationPath .\demo
```

Após extrair, abra a pasta `demo` no VS Code ou no caminho escolhido.

## 3) Abrir/importar no Visual Studio Code

1. Abra o VS Code.
2. Instale (se ainda não instalou) as extensões recomendadas listadas na seção "Pré-requisitos".
3. Para gerar diretamente pelo VS Code: abra a paleta de comandos (Ctrl+Shift+P) e execute "Spring Initializr: Generate a Maven Project". Siga os prompts e o VS Code criará e abrirá a pasta do projeto.
4. Se você já baixou/extraiu o ZIP, use "File -> Open Folder..." e selecione a pasta do projeto.
5. Ao abrir, o VS Code pode perguntar para importar o projeto como um projeto Maven/Java — aceite para configurar o ambiente de ferramentas (download de dependências, etc.).

## 4) Executar a aplicação (PowerShell)

Dentro da pasta do projeto (ex: `demo`), se houver o wrapper Maven, execute:

```powershell
cd .\demo
.\mvnw.cmd clean package
.\mvnw.cmd spring-boot:run
```

Se não houver wrapper, use o Maven instalado:

```powershell
mvn clean package
mvn spring-boot:run
```

A aplicação geralmente fica disponível em http://localhost:8080.

## 5) Troubleshooting rápido

- "JAVA_HOME is not set": defina a variável de ambiente `JAVA_HOME` para o diretório do JDK e reinicie o terminal/VS Code.
- Dependências não resolvidas no VS Code: aguarde o download do Maven/Gradle ou execute `mvnw.cmd dependency:resolve`.
- Proxy ao baixar do start.spring.io: configure o proxy nas configurações do sistema/VS Code ou baixe usando o navegador com as credenciais do proxy.

## Links úteis

- Spring Initializr: https://start.spring.io
- Extensões recomendadas VS Code: procure por "Spring Boot Extension Pack" na marketplace do VS Code

---

Se quiser, eu posso:
- Gerar exemplos de URLs do `start.spring.io` para baixar projetos com conjuntos comuns de dependências (ex.: Web + JPA + H2).
- Criar um pequeno script PowerShell que gera + abre o projeto automaticamente no VS Code.
