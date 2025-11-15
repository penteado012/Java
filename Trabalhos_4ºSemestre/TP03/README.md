# Projetos Java - Calculadora e FormPessoa (v03)

Este repositório contém dois projetos desenvolvidos em **Java** utilizando **Swing** para interfaces gráficas (GUI): uma **Calculadora** e um **Formulário de Cadastro de Pessoa** (versão 03).

---

## 1. Calculadora

Uma aplicação de calculadora simples com interface gráfica, que realiza operações básicas:

- Adição (+)
- Subtração (-)
- Multiplicação (*)
- Divisão (/)

### Funcionalidades:

- Botões numéricos de 0 a 9.
- Operadores básicos.
- Botão `C` para limpar o display.
- Suporte a números decimais.
- Cálculo de resultados exibidos ao clicar `=`.

### Exemplo de uso:

1. Digite um número.
2. Clique em um operador.
3. Digite outro número.
4. Clique em `=` para ver o resultado.
5. Clique em `C` para reiniciar.

---

## 2. FormPessoa (v03)

Um formulário para cadastro de informações de uma pessoa, utilizando **Swing**.

### Campos do formulário:

1. **Número do KP** – gerado automaticamente.
2. **Nome** – obrigatório.
3. **Sexo** – opções "Masculino" ou "Feminino" via **RadioButton**.
4. **Idade** – campo numérico limitado a 2 dígitos.
5. **Botão OK** – valida os campos e salva os dados.
6. **Botão Mostrar** – exibe os dados salvos em uma caixa de diálogo.

### Funcionalidades:

- Validação de campos obrigatórios.
- Apenas números permitidos no campo de idade.
- Controle de escolha única no sexo usando `ButtonGroup`.
- Geração automática de KP incrementando a cada cadastro.

---

## Estrutura do Projeto

- `Calculadora.java` → Classe principal da calculadora.
- `FormPessoa.java` → Classe principal do formulário de pessoa.
- `Pessoa.java` → Classe que representa os dados da pessoa.
- `App.java` → Classe para iniciar as aplicações.

---

## Tecnologias utilizadas

- Java SE 8+
- Swing (GUI)
- NetBeans ou qualquer IDE compatível com Java

---

## Observações

- Este repositório é focado no aprendizado de **Java GUI** e manipulação básica de eventos.
- FormPessoa está na **versão 03**, com melhorias de validação e exibição de dados.
- A calculadora é uma versão funcional básica, sem uso de listas ou estruturas complexas.

---

### Autor

**Matheus Penteado**
