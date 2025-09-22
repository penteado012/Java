# Formulário com Botões e Contadores de Cliques

Este projeto em **Java AWT** implementa um formulário gráfico com três botões.  
Cada botão possui um contador que registra quantas vezes ele foi clicado.

---

## 🚀 Funcionalidades
- Janela gráfica criada com a classe `Frame`.
- Três botões interativos (`Botão 1`, `Botão 2`, `Botão 3`).
- Cada botão atualiza um `Label` exibindo a quantidade de cliques.
- Fechamento da janela tratado pela classe `fechaJanela`.

---

## 📂 Estrutura do código
- **Form6.java**  
  - Classe principal `Form6` que herda de `Frame` e implementa `ActionListener`.  
  - Contadores de cliques (`k1`, `k2`, `k3`).  
  - Botões e labels para exibição.  
  - Método `actionPerformed` para tratar eventos dos botões.  
  - Método `main` para inicialização da aplicação.  

- **fechaJanela.java**  
  - Classe que herda de `WindowAdapter`.  
  - Implementa o método `windowClosing` para encerrar o programa ao fechar a janela.  

---

## 🛠️ Tecnologias utilizadas
- Java SE
- AWT (Abstract Window Toolkit)

---

## ▶️ Como executar
1. Compile o código:
   ```bash
   javac Form6.java
