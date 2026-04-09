# 🍃 Guia de Configuração: Spring Boot + VS Code (Interface Visual)

Este repositório contém um guia passo a passo para configurar um ambiente de desenvolvimento Java com Spring Boot, utilizando apenas a interface visual do Visual Studio Code.

---

## 🛠️ 1. Pré-requisitos (O Kit de Sobrevivência)

Antes de começar, você precisa instalar o motor do Java e as ferramentas de automação:

1.  **JDK 17 ou 21:** * Recomendado: [Eclipse Temurin (Adoptium)](https://adoptium.net/). 
    * *Nota:* Durante a instalação, marque a caixa **"Set JAVA_HOME"**.
2.  **Visual Studio Code:** [Download aqui](https://code.visualstudio.com/).
3.  **Extensões do VS Code (Ctrl+Shift+X):**
    * `Extension Pack for Java` (Microsoft)
    * `Spring Boot Extension Pack` (VMware)
    * `Lombok Annotations Support` (Para evitar erros de Getter/Setter)

---

## 🏗️ 2. Criando o Projeto (Sem Digitar Comandos)

1.  Abra o VS Code.
2.  Pressione **`Ctrl + Shift + P`** para abrir a Paleta de Comandos.
3.  Digite e selecione: **`Spring Initializr: Create a Maven Project`**.
4.  **Siga o fluxo de configuração no topo da tela:**

| Configuração | O que selecionar/digitar |
| :--- | :--- |
| **Spring Boot Version** | Escolha a versão estável mais recente (ex: 3.x.x) |
| **Language** | `Java` |
| **Group Id** | `com.projeto` (seu identificador) |
| **Artifact Id** | `meu-app` (nome do projeto) |
| **Packaging** | `Jar` |
| **Java Version** | `17` ou `21` |
| **Dependencies** | Selecione: `Spring Web`, `Spring Boot DevTools`, `Lombok` |

5. Escolha uma pasta no seu computador e clique em **Generate into this folder**.
6. Quando aparecer o aviso no canto inferior, clique em **Open**.

---

## ⚙️ 3. Configuração do Ambiente de Trabalho

Assim que o projeto carregar, o VS Code baixará as dependências automaticamente.

### Criando sua primeira API
1. No menu lateral, navegue até: `src/main/java/com/projeto/meuapp/`.
2. Clique com o **botão direito** na pasta e selecione **New Java Class**.
3. Nomeie como `OlaController.java` e cole o código:

```java
package com.projeto.meuapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    @GetMapping("/")
    public String home() {
        return "Servidor Spring Boot rodando com sucesso! 🚀";
    }
}