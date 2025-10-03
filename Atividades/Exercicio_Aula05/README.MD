# Exercício 01 - Nome dos Meses

Este programa em Java solicita que o usuário digite um número de 1 a 12 e exibe o nome correspondente do mês. Ele demonstra o uso de **arrays**, **entrada de dados via Scanner** e **tratamento de exceções**.

---

## Funcionalidade

1. Armazena os nomes dos meses em um **array de Strings**.
2. Solicita que o usuário digite um número entre 1 e 12.
3. Exibe o mês correspondente no console.

---

## Tratamento de Exceções

O programa trata duas situações de erro comuns:

- **`InputMismatchException`** → Caso o usuário digite algo que não seja um número.  
- **`ArrayIndexOutOfBoundsException`** → Caso o usuário digite um número menor que 1 ou maior que 12.

Dessa forma, o programa evita erros de execução e fornece mensagens claras ao usuário.

---

# Exercício 02 - Operações Aritméticas com JOptionPane

Este programa em Java solicita que o usuário digite dois números e realiza as operações **soma, multiplicação e divisão**, exibindo os resultados em caixas de diálogo (`JOptionPane`). O programa continua executando até que o usuário digite `0` como primeiro número.

---

## Funcionalidade

1. Solicita ao usuário que digite o **primeiro número (`num`)**.  
   - Se for `0`, o programa é encerrado.
2. Solicita o **segundo número (`num2`)**.  
3. Calcula e exibe:
   - Soma (`num + num2`)
   - Multiplicação (`num * num2`)
   - Divisão (`num / num2`)
4. Repete o processo até que o usuário digite `0` como primeiro número.

---

## Tratamento de Exceções

O programa trata duas situações de erro:

- **`NumberFormatException`** → Caso o usuário digite algo que não seja um número.  
- **`ArithmeticException`** → Caso o usuário tente dividir por zero (somente para números inteiros).

O tratamento garante que o programa não quebre e fornece mensagens de erro amigáveis.

---